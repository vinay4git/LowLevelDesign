package behavioral.StrategyPattern.WithStrategy;

import behavioral.StrategyPattern.WithStrategy.models.BudgetVilla;
import behavioral.StrategyPattern.WithStrategy.models.Villa;

public class StrategyPatternMain {
    public static void main(String[] args) {

        Villa villa = new BudgetVilla();

        villa.doFlooring();
    }
}
