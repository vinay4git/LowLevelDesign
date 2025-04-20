package DesignPatterns.behavioral.E_NullObjectDesignPattern;

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
