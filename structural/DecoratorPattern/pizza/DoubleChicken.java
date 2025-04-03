package structural.DecoratorPattern.pizza;

public class DoubleChicken implements BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
