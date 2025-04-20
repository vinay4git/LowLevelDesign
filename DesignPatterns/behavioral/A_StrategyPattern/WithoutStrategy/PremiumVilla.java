package DesignPatterns.behavioral.A_StrategyPattern.WithoutStrategy;

public class PremiumVilla extends Villa {
    @Override
    void doFlooring() {
        System.out.println("Marble flooring");
    }
}
