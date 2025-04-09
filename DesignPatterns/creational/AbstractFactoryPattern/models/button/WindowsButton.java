package DesignPatterns.creational.AbstractFactoryPattern.models.button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a WindowsButton.");
    }
}
