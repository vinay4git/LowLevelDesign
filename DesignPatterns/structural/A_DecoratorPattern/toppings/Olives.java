package DesignPatterns.structural.A_DecoratorPattern.toppings;

import DesignPatterns.structural.A_DecoratorPattern.pizza.BasePizza;

public class Olives extends Toppings {
    public Olives(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + 10;
    }
}
