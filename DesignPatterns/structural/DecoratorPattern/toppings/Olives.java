package DesignPatterns.structural.DecoratorPattern.toppings;

import DesignPatterns.structural.DecoratorPattern.pizza.BasePizza;

public class Olives implements Toppings {
    private BasePizza pizza;

    public Olives(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }
}
