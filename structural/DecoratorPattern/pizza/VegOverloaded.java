package structural.DecoratorPattern.pizza;

public class VegOverloaded implements BasePizza{
    @Override
    public int cost() {
        return 100;
    }
}
