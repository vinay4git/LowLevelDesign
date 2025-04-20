package DesignPatterns.behavioral.E_NullObjectDesignPattern;

public class VehicleFactory {

    Vehicle getVehicle(String vehicle) {
        if (vehicle.equalsIgnoreCase("car")) {
            return new Car();
        } else if (vehicle.equalsIgnoreCase("Bike")) {
            return new Bike();
        }
        return new NullVehicle();
    }

}
