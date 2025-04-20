package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC;

public interface AirConditioner {
    void turnOn();
    void turnOff();
    void incrementTemperature();
    void decrementTemperature();

}
