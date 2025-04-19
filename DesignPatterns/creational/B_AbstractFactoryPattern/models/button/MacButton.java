package DesignPatterns.creational.B_AbstractFactoryPattern.models.button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a MacButton.");
    }
}
