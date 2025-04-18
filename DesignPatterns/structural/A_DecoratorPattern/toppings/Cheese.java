package DesignPatterns.structural.A_DecoratorPattern.toppings;

import DesignPatterns.structural.A_DecoratorPattern.pizza.BasePizza;

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
