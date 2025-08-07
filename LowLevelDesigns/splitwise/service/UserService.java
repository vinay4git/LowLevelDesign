package LowLevelDesigns.splitwise.service;

import splitwise.model.Balance;
import splitwise.model.User;

public class UserService {
    BalanceService balanceService;

    public UserService(BalanceService balanceService) {
        this.balanceService = balanceService;
    }

    public void getBalance(User currentUser) {

        Balance userBalanceMap = balanceService.getUserBalanceMap(currentUser);

        userBalanceMap.getUserOweMap().forEach((user, amount) -> {
            if ( amount > 0) {
                System.out.println(currentUser.getName() + " gets " + amount + " from " + user.getName());
            } else if (amount < 0) {
                System.out.println(currentUser.getName() + " owes " + Math.abs(amount) + " to " + user.getName());
            }
        });
    }

}
