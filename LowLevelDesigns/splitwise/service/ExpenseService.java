package LowLevelDesigns.splitwise.service;

import LowLevelDesigns.splitwise.model.*;
import LowLevelDesigns.splitwise.service.split.EqualSplitService;
import LowLevelDesigns.splitwise.service.split.ExactAmountSplitService;
import LowLevelDesigns.splitwise.service.split.ShareSplitSplitService;
import LowLevelDesigns.splitwise.service.split.SplitService;

import java.util.List;

public class ExpenseService {
    BalanceService balanceService;

    public ExpenseService(BalanceService balanceService) {
        this.balanceService = balanceService;
    }

    public void addExpense(User paidByUser, Double expenseAmount, List<User> users, SplitType splitType, List<Double> splitDivision) {

        Expense expense = new Expense(expenseAmount, paidByUser, splitType);

        SplitService splitService = getSplitService(splitType, expense, users, splitDivision);

        List<Split> splitPerUser = splitService.getSplits();

        balanceService.updateBalance(paidByUser, splitPerUser);

    }

    private static SplitService getSplitService(SplitType splitType, Expense expense, List<User> users, List<Double> splitDivision) {
        if (SplitType.EQUAL.equals(splitType)) {
            return new EqualSplitService(users, expense);
        } else if (SplitType.EXACT.equals(splitType)) {
            return new ExactAmountSplitService(users, expense, splitDivision);
        } else if (SplitType.SHARE.equals(splitType)) {
            return new ShareSplitSplitService(users, expense, splitDivision);
        } else {
            return null;
        }
    }
}
