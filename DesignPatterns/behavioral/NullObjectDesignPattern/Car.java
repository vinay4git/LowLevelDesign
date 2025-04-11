package DesignPatterns.behavioral.NullObjectDesignPattern;

public class Car implements Vehicle{
    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public Integer getModel() {
        return 2021;
    }
}
