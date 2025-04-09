package DesignPatterns.structural.DecoratorPattern.toppings;

import DesignPatterns.structural.DecoratorPattern.pizza.BasePizza;

public class ExtraCheese implements Toppings{
    private BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }
}
