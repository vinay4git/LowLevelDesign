package LowLevelDesigns.splitwise.service.split;

import splitwise.model.Expense;
import splitwise.model.Split;
import splitwise.model.User;

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
