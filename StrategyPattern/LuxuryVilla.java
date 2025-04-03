package StrategyPattern;

import StrategyPattern.strategy.FlooringStrategy;
import StrategyPattern.strategy.MarbleStrategy;

public class LuxuryVilla extends Villa {

    public LuxuryVilla() {
        super(new MarbleStrategy());
    }

}
