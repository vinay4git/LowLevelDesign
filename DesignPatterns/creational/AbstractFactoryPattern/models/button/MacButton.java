package DesignPatterns.creational.AbstractFactoryPattern.models.button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a MacButton.");
    }
}
