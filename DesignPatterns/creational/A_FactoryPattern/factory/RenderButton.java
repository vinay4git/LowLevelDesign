package DesignPatterns.creational.A_FactoryPattern.factory;

import DesignPatterns.creational.A_FactoryPattern.models.Button;

public abstract class RenderButton {

    protected abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.paint();
    }
}
