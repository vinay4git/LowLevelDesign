package DesignPatterns.creational.FactoryPattern.factory;

import DesignPatterns.creational.FactoryPattern.models.Button;
import DesignPatterns.creational.FactoryPattern.models.WindowsButton;

public class WindowsRenderButton extends RenderButton {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
