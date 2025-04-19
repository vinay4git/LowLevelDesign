package DesignPatterns.creational.A_FactoryPattern.models;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a WindowsButton.");
    }
}
