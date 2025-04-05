package creational.AbstractFactoryPattern;

import creational.AbstractFactoryPattern.factory.MacFactory;
import creational.AbstractFactoryPattern.factory.UIFactory;
import creational.AbstractFactoryPattern.factory.WindowsFactory;

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
