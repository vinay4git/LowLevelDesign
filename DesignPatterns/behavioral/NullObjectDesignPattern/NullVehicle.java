package DesignPatterns.behavioral.NullObjectDesignPattern;

public class NullVehicle implements Vehicle{
    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public Integer getModel() {
        return 0;
    }
}
