package behavioral.StrategyPattern.WithStrategy.models;


import behavioral.StrategyPattern.WithStrategy.strategy.TileStrategy;

public class BudgetVilla extends Villa{
    public BudgetVilla() {
        super(new TileStrategy());
    }
}
