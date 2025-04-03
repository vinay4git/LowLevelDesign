package StrategyPattern.strategy;

public class MarbleStrategy implements FlooringStrategy{
    @Override
    public void floor() {
        // Marble Strategy
        System.out.println("Marble strategy");
    }
}
