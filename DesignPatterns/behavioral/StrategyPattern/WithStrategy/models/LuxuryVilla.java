package DesignPatterns.behavioral.StrategyPattern.WithStrategy.models;


import DesignPatterns.behavioral.StrategyPattern.WithStrategy.strategy.MarbleStrategy;

public class LuxuryVilla extends Villa {

    public LuxuryVilla() {
        super(new MarbleStrategy());
    }

}
