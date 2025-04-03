package StrategyPattern.WithStrategy;


import StrategyPattern.WithStrategy.strategy.MarbleStrategy;

public class LuxuryVilla extends Villa {

    public LuxuryVilla() {
        super(new MarbleStrategy());
    }

}
