package OOPS.customOptional;

public class CustomOptionalMain {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("RR");
        Vehicle def = new Vehicle(null);

        System.out.println(CustomOptional.ofNullable(vehicle)
                .map(Vehicle::getName)
                .orElse(null));

        System.out.println(CustomOptional.ofNullable(def)
                .map(Vehicle::getName)
                .orElse("default car"));

    }
}

class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
