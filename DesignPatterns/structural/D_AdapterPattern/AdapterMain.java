package DesignPatterns.structural.D_AdapterPattern;

import DesignPatterns.structural.D_AdapterPattern.Adaptee.WeighingMachineForBabies;
import DesignPatterns.structural.D_AdapterPattern.Adapter.WeightPoundToKgAdapterImpl;

import java.util.Scanner;

public class AdapterMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int weight = s.nextInt();
        WeighingMachineForBabies weighingMachineForBabies = new WeighingMachineForBabies(weight);
        WeightPoundToKgAdapterImpl weightPoundToKgAdapter = new WeightPoundToKgAdapterImpl(weighingMachineForBabies);

        System.out.println(weightPoundToKgAdapter.getWeightInKg());
    }
}
