package behavioral.StrategyPattern.WithStrategy.models;


import behavioral.StrategyPattern.WithStrategy.strategy.FlooringStrategy;

public class Villa  {
    FlooringStrategy flooringStrategy;
    public Villa(FlooringStrategy flooringStrategy) {
        this.flooringStrategy = flooringStrategy;
    }

    public void doFlooring() {
        flooringStrategy.floor();
    }
}
