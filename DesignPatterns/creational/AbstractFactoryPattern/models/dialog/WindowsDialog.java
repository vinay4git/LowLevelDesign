package DesignPatterns.creational.AbstractFactoryPattern.models.dialog;

public class WindowsDialog implements Dialog{
    @Override
    public void show() {
        System.out.println("Showing up the windows Dialog Box");
    }
}
