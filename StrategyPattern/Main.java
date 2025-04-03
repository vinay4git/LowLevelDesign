package StrategyPattern;

import StrategyPattern.strategy.MarbleStrategy;

public class Main {
    public static void main(String[] args) {

        Villa villa = new BudgetVilla();

        villa.doFlooring();
    }
}
