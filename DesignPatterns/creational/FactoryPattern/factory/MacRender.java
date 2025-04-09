package DesignPatterns.creational.FactoryPattern.factory;

import DesignPatterns.creational.FactoryPattern.models.Button;
import DesignPatterns.creational.FactoryPattern.models.MacButton;

public class MacRender extends Render {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
