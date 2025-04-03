package behavioral.StrategyPattern.WithStrategy;

public class StrategyPatternMain {
    public static void main(String[] args) {

        Villa villa = new BudgetVilla();

        villa.doFlooring();
    }
}
