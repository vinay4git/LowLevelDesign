package DesignPatterns.structural.A_DecoratorPattern.toppings;

import DesignPatterns.structural.A_DecoratorPattern.pizza.BasePizza;

public abstract class Toppings implements BasePizza {
    protected BasePizza pizza;

    public Toppings(BasePizza pizza) {
        this.pizza = pizza;
    }

    public abstract int cost();
}
