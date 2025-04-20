package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC;

import javax.sound.midi.Soundbank;

public class BlueStarAC extends AirConditioner {

    @Override
    public void turnOn() {
        currentTemp = 27;
        System.out.println("Turn on BlueStar AC");
    }

    @Override
    public void turnOff() {
        currentTemp = 0;
        System.out.println("turn off BlueStar AC");
    }

    @Override
    public void incrementTemperature() {
        currentTemp++;
        System.out.println("Increase Temperature in BlueStar AC");
    }

    @Override
    public void decrementTemperature() {
        currentTemp--;
        System.out.println("Decrease Temperature in BlueStar AC");
    }

    @Override
    public void setToTemperature(double temp) {
        currentTemp = temp;
        System.out.println("Set the AC to specific temp " + temp);
    }

    public double getCurrentTemp() {
        return currentTemp;
    }
}
