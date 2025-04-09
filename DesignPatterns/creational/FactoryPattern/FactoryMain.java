package DesignPatterns.creational.FactoryPattern;

import DesignPatterns.creational.FactoryPattern.factory.MacRenderButton;
import DesignPatterns.creational.FactoryPattern.factory.RenderButton;
import DesignPatterns.creational.FactoryPattern.factory.WindowsRenderButton;

public class FactoryMain {
    public static void main(String[] args) {
        // Some setting or input to decide the configuration of the OS
        String os = "MAC";
        RenderButton renderButton;

        if (os.equalsIgnoreCase("WINDOWS")) {
            renderButton = new WindowsRenderButton();
        } else if (os.equalsIgnoreCase("MAC")) {
            renderButton = new MacRenderButton();
        } else {
            return;
        }

        renderButton.render();
    }
}
