package DesignPatterns.structural.D_AdapterPattern.Adapter;

import DesignPatterns.structural.D_AdapterPattern.Adaptee.WeighingMachineForBabies;

public class WeightPoundToKgAdapterImpl implements WeightPoundToKgAdapter{
    WeighingMachineForBabies weighingMachineForBabies;

    public WeightPoundToKgAdapterImpl(WeighingMachineForBabies weighingMachineForBabies) {
        this.weighingMachineForBabies = weighingMachineForBabies;
    }

    @Override
    public double getWeightInKg() {
        return weighingMachineForBabies.getWeightInPounds() * 0.45;
    }
}
