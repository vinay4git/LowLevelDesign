package LowLevelDesigns.splitwise.service.split;

import LowLevelDesigns.splitwise.model.Expense;
import LowLevelDesigns.splitwise.model.Split;
import LowLevelDesigns.splitwise.model.User;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ShareSplitSplitService implements SplitService {
    List<User> users;
    List<Double> splitDivision;
    Expense expense;

    public ShareSplitSplitService(List<User> users, Expense expense, List<Double> splitDivision) {
        this.users = users;
        this.splitDivision = splitDivision;
        this.expense = expense;
    }


    @Override
    public List<Split> getSplits() {
        double totalDivisions = splitDivision.stream().mapToDouble(Double::doubleValue).sum();

        BigDecimal amount = BigDecimal.valueOf(expense.getAmount());

        BigDecimal amountPerDivision = amount.divide(BigDecimal.valueOf(totalDivisions), 2, RoundingMode.HALF_DOWN);

        List<Split> splits = new ArrayList<>();
        BigDecimal currentAmount = BigDecimal.ZERO;
        for (int i = 1; i < users.size() ; i++) {
            BigDecimal splitAmount = amountPerDivision.multiply(BigDecimal.valueOf(splitDivision.get(i)));

            splits.add(new Split(users.get(i), splitAmount.doubleValue()));
            currentAmount = currentAmount.add(splitAmount);
        }

        BigDecimal remainingAmount = amount.subtract(currentAmount);
        splits.add(new Split(users.get(0), remainingAmount.doubleValue()));

        return splits;
    }
}
