package StrategyPattern;

import StrategyPattern.strategy.FlooringStrategy;

public class Villa  {
    FlooringStrategy flooringStrategy;
    public Villa(FlooringStrategy flooringStrategy) {
        this.flooringStrategy = flooringStrategy;
    }

    void doFlooring() {
        flooringStrategy.floor();
    }
}
