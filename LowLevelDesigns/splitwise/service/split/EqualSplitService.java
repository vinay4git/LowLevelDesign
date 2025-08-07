package LowLevelDesigns.splitwise.service.split;

import splitwise.model.Expense;
import splitwise.model.Split;
import splitwise.model.User;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class EqualSplitService implements SplitService {
    List<User> users;
    Expense expense;

    public EqualSplitService(List<User> users, Expense expense) {
        this.users = users;
        this.expense = expense;
    }

    @Override
    public List<Split> getSplits() {
        BigDecimal amount = BigDecimal.valueOf(expense.getAmount());

        BigDecimal eachPersonAmount = amount.divide(BigDecimal.valueOf(users.size()), 2, RoundingMode.HALF_DOWN);
        BigDecimal sumSoFar = BigDecimal.ZERO;
        List<Split> splits = new ArrayList<>();
        for (int i = 1  ; i <users.size(); i++) {
            splits.add(new Split(users.get(i), eachPersonAmount.doubleValue()));

            sumSoFar = sumSoFar.add(eachPersonAmount);
        }

        splits.add(new Split(users.get(0),amount.subtract(sumSoFar).doubleValue()));

        return splits;
    }
}
