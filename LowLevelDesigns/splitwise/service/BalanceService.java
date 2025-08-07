package LowLevelDesigns.splitwise.service;

import splitwise.model.Balance;
import splitwise.model.Split;
import splitwise.model.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class BalanceService {
    Map<User, Balance> userBalanceMap;

    public BalanceService(Map<User, Balance> userBalanceMap) {
        this.userBalanceMap = userBalanceMap;
    }

    public void updateBalance(User paidByUser, List<Split> splits) {
        Balance paidUserBalance = userBalanceMap.computeIfAbsent(paidByUser, user -> new Balance(new HashMap<>(), 0.0));

        splits.stream()
                .filter(split -> !split.getUser().equals(paidByUser))
                .forEach(split -> {
                    paidUserBalance.addOwingAmount(split);

                    Balance owingUserBalance = userBalanceMap.computeIfAbsent(split.getUser(), (user) -> new Balance(new HashMap<>(), 0.0));
                    owingUserBalance.reduceOwingBalance(paidByUser, split.getAmount());
                });

    }

    public Balance getUserBalanceMap(User user) {
        return userBalanceMap.getOrDefault(user, new Balance(new HashMap<>(), 0.0));
    }

    public void getAllBalance() {
        HashSet<User> visitedUsers = new HashSet<>();
        userBalanceMap.entrySet().forEach(userBalanceEntry -> {
            userBalanceEntry.getValue().getUserOweMap().entrySet().stream()
                    .filter(userDoubleEntry -> !visitedUsers.contains(userDoubleEntry.getKey()))
                    .forEach(userOweEntry -> {
                        if ( userOweEntry.getValue() > 0) {
                            System.out.println(userBalanceEntry.getKey().getName() + " gets " + userOweEntry.getValue() + " from " + userOweEntry.getKey().getName());
                        } else if (userOweEntry.getValue() < 0) {
                            System.out.println(userBalanceEntry.getKey().getName() + " owes " + Math.abs(userOweEntry.getValue()) + " to " + userOweEntry.getKey().getName());
                        }
            });

            visitedUsers.add(userBalanceEntry.getKey());
        });

    }
}
