package LowLevelDesigns.splitwise.model;

import java.util.Map;

public class Balance {
    Map<User, Double> userOweMap;
    Double totalAmount;

    public Balance(Map<User, Double> userOweMap, Double totalAmount) {
        this.userOweMap = userOweMap;
        this.totalAmount = totalAmount;
    }

    public Map<User, Double> getUserOweMap() {
        return userOweMap;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setUserOweMap(Map<User, Double> userOweMap) {
        this.userOweMap = userOweMap;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addOwingAmount(Split userSplit) {
        Double owingAmount = userOweMap.getOrDefault(userSplit.getUser(), 0.0);

        owingAmount += userSplit.getAmount();
        totalAmount += userSplit.getAmount();;

        userOweMap.put(userSplit.getUser(), owingAmount);
    }

    public void reduceOwingBalance(User paidByUser, Double amount) {
        Double owingAmount = userOweMap.getOrDefault(paidByUser, 0.0);

        owingAmount -= amount;
        totalAmount -= amount;

        userOweMap.put(paidByUser, owingAmount);
    }
}
