package DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.models;


import DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.strategy.MarbleStrategy;

public class LuxuryVilla extends Villa {

    public LuxuryVilla() {
        super(new MarbleStrategy());
    }

}
