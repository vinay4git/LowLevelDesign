package behavioral.StrategyPattern.WithStrategy;


import behavioral.StrategyPattern.WithStrategy.strategy.MarbleStrategy;

public class LuxuryVilla extends Villa {

    public LuxuryVilla() {
        super(new MarbleStrategy());
    }

}
