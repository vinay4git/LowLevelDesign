package DesignPatterns.structural.A_DecoratorPattern.toppings;

import DesignPatterns.structural.A_DecoratorPattern.pizza.BasePizza;

public interface Toppings extends BasePizza {
    public abstract int cost();
}
