package creational.FactoryPattern.factory;

import creational.FactoryPattern.models.Button;
import creational.FactoryPattern.models.MacButton;

public class MacRender extends Render {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
