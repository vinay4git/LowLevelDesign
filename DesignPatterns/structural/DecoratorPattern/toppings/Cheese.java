package DesignPatterns.structural.DecoratorPattern.toppings;

import DesignPatterns.structural.DecoratorPattern.pizza.BasePizza;

public class Cheese implements Toppings{
    private BasePizza pizza;

    public Cheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
