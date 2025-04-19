package DesignPatterns.creational.B_AbstractFactoryPattern.models.dialog;

public class MacDialog implements Dialog{
    @Override
    public void show() {
        System.out.println("Showing the Mac Dialog Box");
    }
}
