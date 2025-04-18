package DesignPatterns.structural.D_AdapterPattern;

import DesignPatterns.structural.D_AdapterPattern.Adaptee.WeighingMachineForBabies;
import DesignPatterns.structural.D_AdapterPattern.Adapter.WeightPoundToKgAdapterImpl;

public class AdapterMain {
    public static void main(String[] args) {
        WeighingMachineForBabies weighingMachineForBabies = new WeighingMachineForBabies(30);
        WeightPoundToKgAdapterImpl weightPoundToKgAdapter = new WeightPoundToKgAdapterImpl(weighingMachineForBabies);

        System.out.println(weightPoundToKgAdapter.getWeightInKg());
    }
}
