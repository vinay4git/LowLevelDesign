package creational.FactoryPattern.models;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a MacButton.");
    }
}
