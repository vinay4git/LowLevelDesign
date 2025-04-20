package DesignPatterns.behavioral.A_StrategyPattern.WithStrategy.strategy;

public class MarbleStrategy implements FlooringStrategy {
    @Override
    public void floor() {
        // Marble Strategy
        System.out.println("Marble strategy");
    }
}
