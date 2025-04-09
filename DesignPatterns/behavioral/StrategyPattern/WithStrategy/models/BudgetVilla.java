package DesignPatterns.behavioral.StrategyPattern.WithStrategy.models;


import DesignPatterns.behavioral.StrategyPattern.WithStrategy.strategy.TileStrategy;

public class BudgetVilla extends Villa{
    public BudgetVilla() {
        super(new TileStrategy());
    }
}
