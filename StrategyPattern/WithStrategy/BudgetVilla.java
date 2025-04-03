package StrategyPattern.WithStrategy;


import StrategyPattern.WithStrategy.strategy.TileStrategy;

public class BudgetVilla extends Villa{
    public BudgetVilla() {
        super(new TileStrategy());
    }
}
