package structural.DecoratorPattern;

import structural.DecoratorPattern.pizza.BasePizza;
import structural.DecoratorPattern.pizza.VegOverloaded;
import structural.DecoratorPattern.toppings.Cheese;
import structural.DecoratorPattern.toppings.ExtraCheese;
import structural.DecoratorPattern.toppings.Olives;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern");
        System.out.println("---------------");
        System.out.println("Decorator Pattern is a structural pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.");
        System.out.println("It is a flexible alternative to subclassing for extending functionality.");
        System.out.println("---------------");
        System.out.println("Example: Pizza with toppings");
        System.out.println("---------------");
        System.out.println("Base Pizza: Veg Overloaded");
        System.out.println("Cost: 100");
        System.out.println("Toppings: Cheese, Olives, Extra Cheese");
        System.out.println("Total Cost: 100 + 20 + 10 + 30");
        BasePizza vegOverLoadedWithToppings = new ExtraCheese(new Olives(new Cheese(new VegOverloaded())));

        System.out.println("Total Cost: " + vegOverLoadedWithToppings.cost());
    }
}
