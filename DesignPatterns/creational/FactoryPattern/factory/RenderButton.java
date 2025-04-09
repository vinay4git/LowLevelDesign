package DesignPatterns.creational.FactoryPattern.factory;

import DesignPatterns.creational.FactoryPattern.models.Button;

public abstract class RenderButton {

    protected abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.paint();
    }
}
