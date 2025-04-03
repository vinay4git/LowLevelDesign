package StrategyPattern.WithStrategy;

public class Main {
    public static void main(String[] args) {

        Villa villa = new BudgetVilla();

        villa.doFlooring();
    }
}
