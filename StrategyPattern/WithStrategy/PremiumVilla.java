package StrategyPattern.WithStrategy;

import StrategyPattern.WithStrategy.strategy.MarbleStrategy;

public class PremiumVilla extends Villa {

    public PremiumVilla() {
        super(new MarbleStrategy());
    }
}
