package LowLevelDesigns.splitwise.service.split;

import LowLevelDesigns.splitwise.model.Expense;
import LowLevelDesigns.splitwise.model.Split;
import LowLevelDesigns.splitwise.model.User;

import java.util.ArrayList;
import java.util.List;

public class ExactAmountSplitService implements SplitService {
    List<User> users;
    List<Double> amounts;
    Expense expense;

    public ExactAmountSplitService(List<User> users, Expense expense, List<Double> amounts) {
        this.users = users;
        this.amounts = amounts;
        this.expense = expense;
    }


    @Override
    public List<Split> getSplits() {
        List<Split> splits = new ArrayList<>();
        for (int i = 0; i < users.size() ; i++) {
            splits.add(new Split(users.get(i), amounts.get(i)));
        }
        return splits;
    }
}
