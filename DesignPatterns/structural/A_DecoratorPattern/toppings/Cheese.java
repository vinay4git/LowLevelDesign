package DesignPatterns.structural.A_DecoratorPattern.toppings;

import DesignPatterns.structural.A_DecoratorPattern.pizza.BasePizza;

public class Cheese extends Toppings{

    public Cheese(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
