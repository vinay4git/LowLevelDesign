package DesignPatterns.behavioral.E_NullObjectDesignPattern;

public class Bike implements Vehicle{
    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public Integer getModel() {
        return 2022;
    }
}
