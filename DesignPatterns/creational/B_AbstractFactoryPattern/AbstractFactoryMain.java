package DesignPatterns.creational.B_AbstractFactoryPattern;

import DesignPatterns.creational.B_AbstractFactoryPattern.factory.MacFactory;
import DesignPatterns.creational.B_AbstractFactoryPattern.factory.UIFactory;
import DesignPatterns.creational.B_AbstractFactoryPattern.factory.WindowsFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        UIFactory uiFactory;
        String os = "windows";
        if (os.equalsIgnoreCase("windows")) {
            uiFactory = new WindowsFactory();
        } else if (os.equalsIgnoreCase("mac")) {
            uiFactory = new MacFactory();
        } else {
            return;
        }

        uiFactory.createButton().paint();;
        uiFactory.createDialog().show();
    }
}
