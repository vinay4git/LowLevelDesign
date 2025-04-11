package DesignPatterns.behavioral.NullObjectDesignPattern;

public class NullObjectMain {

    public static void main(String[] args) {
        System.out.println(new VehicleFactory().getVehicle("Car").getModel());
        System.out.println(new VehicleFactory().getVehicle("Bicycle").getModel());
    }
}
