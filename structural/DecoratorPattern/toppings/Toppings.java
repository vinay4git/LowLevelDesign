package structural.DecoratorPattern.toppings;

import structural.DecoratorPattern.pizza.BasePizza;

public interface Toppings extends BasePizza {
    public abstract int cost();
}
