package LowLevelDesigns.splitwise;

import splitwise.model.SplitType;
import splitwise.model.User;
import splitwise.service.BalanceService;
import splitwise.service.ExpenseService;
import splitwise.service.UserService;

import java.util.HashMap;
import java.util.List;

public class SplitwiseDemo {
    public static void main(String[] args) {

        User userOne = new User(1, "userOne", "vinay@gmai.com", 123456789);
        User userTwo = new User(2, "userTwo", "kumar@gmai.com", 143432423);
        User userThree = new User(3, "userThree", "rajvardhan@gmai.com", 234324298);
        User userFour = new User(4, "userFour", "userFour@gmai.com", 23423498);

        BalanceService balanceService = new BalanceService(new HashMap<>());
        UserService userService = new UserService(balanceService);
        ExpenseService expenseService = new ExpenseService(balanceService);

        expenseService.addExpense(userOne,1000.0, List.of(userOne, userTwo, userThree, userFour), SplitType.EQUAL, null);
        expenseService.addExpense(userOne,1250.0, List.of(userTwo, userThree), SplitType.EXACT, List.of(370.0,880.0));
        expenseService.addExpense(userFour,1200.0, List.of(userOne, userTwo, userThree, userFour), SplitType.SHARE, List.of(2.0,1.0, 1.0, 1.0));

        //userService.getBalance(userOne);

        balanceService.getAllBalance();

    }
}
