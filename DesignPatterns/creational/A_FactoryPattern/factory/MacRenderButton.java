package DesignPatterns.creational.A_FactoryPattern.factory;

import DesignPatterns.creational.A_FactoryPattern.models.Button;
import DesignPatterns.creational.A_FactoryPattern.models.MacButton;

public class MacRenderButton extends RenderButton {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
