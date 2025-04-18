package DesignPatterns.structural.D_AdapterPattern.Adaptee;

public class WeighingMachineForBabies {
    private double weight;

    public WeighingMachineForBabies(double weight) {
        this.weight = weight;
    }

    public double  getWeightInPounds(){
        return weight;
    }
}
