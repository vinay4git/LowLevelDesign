package DesignPatterns.behavioral.StrategyPattern.WithStrategy;

import DesignPatterns.behavioral.StrategyPattern.WithStrategy.models.BudgetVilla;
import DesignPatterns.behavioral.StrategyPattern.WithStrategy.models.Villa;

public class StrategyPatternMain {
    public static void main(String[] args) {

        Villa villa = new BudgetVilla();

        villa.doFlooring();
    }
}
