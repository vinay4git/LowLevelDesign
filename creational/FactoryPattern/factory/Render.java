package creational.FactoryPattern.factory;

import creational.FactoryPattern.models.Button;

public abstract class Render {

    protected abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.paint();
    }
}
