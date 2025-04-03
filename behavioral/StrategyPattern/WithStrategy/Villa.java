package behavioral.StrategyPattern.WithStrategy;


import behavioral.StrategyPattern.WithStrategy.strategy.FlooringStrategy;

public class Villa  {
    FlooringStrategy flooringStrategy;
    public Villa(FlooringStrategy flooringStrategy) {
        this.flooringStrategy = flooringStrategy;
    }

    void doFlooring() {
        flooringStrategy.floor();
    }
}
