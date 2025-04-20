package DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.models;


import DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.strategy.TileStrategy;

public class BudgetVilla extends Villa{
    public BudgetVilla() {
        super(new TileStrategy());
    }
}
