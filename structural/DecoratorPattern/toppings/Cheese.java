package structural.DecoratorPattern.toppings;

import structural.DecoratorPattern.pizza.BasePizza;

public class Cheese extends Toppings{
    private BasePizza pizza;

    public Cheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
