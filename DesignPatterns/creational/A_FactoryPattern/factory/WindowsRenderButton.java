package DesignPatterns.creational.A_FactoryPattern.factory;

import DesignPatterns.creational.A_FactoryPattern.models.Button;
import DesignPatterns.creational.A_FactoryPattern.models.WindowsButton;

public class WindowsRenderButton extends RenderButton {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
