package DesignPatterns.structural.DecoratorPattern.toppings;

import DesignPatterns.structural.DecoratorPattern.pizza.BasePizza;

public interface Toppings extends BasePizza {
    public abstract int cost();
}
