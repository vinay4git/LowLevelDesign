package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC;

public abstract class AirConditioner {
    double currentTemp = 0;
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void incrementTemperature();
    public abstract void decrementTemperature();
    public abstract void setToTemperature(double temp);

    public double getCurrentTemp() {
        return currentTemp;
    }
}
