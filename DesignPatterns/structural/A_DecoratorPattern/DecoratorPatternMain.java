package DesignPatterns.structural.A_DecoratorPattern;

import DesignPatterns.structural.A_DecoratorPattern.pizza.BasePizza;
import DesignPatterns.structural.A_DecoratorPattern.pizza.VegOverloaded;
import DesignPatterns.structural.A_DecoratorPattern.toppings.Cheese;
import DesignPatterns.structural.A_DecoratorPattern.toppings.ExtraCheese;
import DesignPatterns.structural.A_DecoratorPattern.toppings.Olives;

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

        BasePizza basePizza = new VegOverloaded();
        BasePizza cheseToppings = new Cheese(basePizza);
        BasePizza oliveToppings = new Olives(cheseToppings);
        BasePizza vegOverLoadedWithToppings = new ExtraCheese(oliveToppings);

        System.out.println("Total Cost: " + vegOverLoadedWithToppings.cost());
    }
}
