package structural.DecoratorPattern.toppings;

import structural.DecoratorPattern.pizza.BasePizza;

public class ExtraCheese extends Toppings{
    private BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }
}
