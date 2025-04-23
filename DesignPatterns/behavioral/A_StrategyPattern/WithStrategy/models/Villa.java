package DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.models;


import DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.strategy.FlooringStrategy;

public abstract class Villa  {
    FlooringStrategy flooringStrategy;
    public Villa(FlooringStrategy flooringStrategy) {
        this.flooringStrategy = flooringStrategy;
    }

    public void doFlooring() {
        flooringStrategy.floor();
    }
}
