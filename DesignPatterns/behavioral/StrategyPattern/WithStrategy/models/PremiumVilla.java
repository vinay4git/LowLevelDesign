package DesignPatterns.behavioral.StrategyPattern.WithStrategy.models;

import DesignPatterns.behavioral.StrategyPattern.WithStrategy.strategy.MarbleStrategy;

public class PremiumVilla extends Villa {

    public PremiumVilla() {
        super(new MarbleStrategy());
    }
}
