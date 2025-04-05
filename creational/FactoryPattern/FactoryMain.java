package creational.FactoryPattern;

import creational.FactoryPattern.factory.MacRender;
import creational.FactoryPattern.factory.Render;
import creational.FactoryPattern.factory.WindowsRender;

public class FactoryMain {
    public static void main(String[] args) {
        // Some setting or input to decide the configuration of the OS
        String os = "MAC";
        Render render;

        if (os.equalsIgnoreCase("WINDOWS")) {
            render = new WindowsRender();
        } else if (os.equalsIgnoreCase("MAC")) {
            render = new MacRender();
        } else {
            return;
        }

        render.render();
    }
}
