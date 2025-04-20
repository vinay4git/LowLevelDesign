package DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.models;

import DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.strategy.MarbleStrategy;

public class PremiumVilla extends Villa {

    public PremiumVilla() {
        super(new MarbleStrategy());
    }
}
