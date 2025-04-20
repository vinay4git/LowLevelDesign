package DesignPatterns.behavioral.A_StrategyPattern.WithStrategy;

import DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.models.BudgetVilla;
import DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.models.Villa;

public class StrategyPatternMain {
    public static void main(String[] args) {

        Villa villa = new BudgetVilla();

        villa.doFlooring();
    }
}
