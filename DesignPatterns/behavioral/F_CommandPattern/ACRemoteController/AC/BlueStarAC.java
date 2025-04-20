package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC;

public class BlueStarAC implements AirConditioner {
    @Override
    public void turnOn() {
        System.out.println("Turn on BlueStar AC");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off BlueStar AC");
    }

    @Override
    public void incrementTemperature() {
        System.out.println("Increase Temperature in BlueStar AC");
    }

    @Override
    public void decrementTemperature() {
        System.out.println("Decrease Temperature in BlueStar AC");
    }
}
