package StrategyPattern;

import StrategyPattern.strategy.FlooringStrategy;
import StrategyPattern.strategy.TileStrategy;

public class BudgetVilla extends Villa{
    public BudgetVilla() {
        super(new TileStrategy());
    }
}
