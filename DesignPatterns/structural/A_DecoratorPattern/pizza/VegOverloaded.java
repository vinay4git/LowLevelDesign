package DesignPatterns.structural.A_DecoratorPattern.pizza;

public class VegOverloaded implements BasePizza{
    @Override
    public int cost() {
        return 100;
    }
}
