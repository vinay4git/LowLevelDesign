package behavioral.StrategyPattern.WithStrategy;

import behavioral.StrategyPattern.WithStrategy.strategy.MarbleStrategy;

public class PremiumVilla extends Villa {

    public PremiumVilla() {
        super(new MarbleStrategy());
    }
}
