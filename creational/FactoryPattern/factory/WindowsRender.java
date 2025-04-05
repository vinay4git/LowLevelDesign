package creational.FactoryPattern.factory;

import creational.FactoryPattern.models.Button;
import creational.FactoryPattern.models.WindowsButton;

public class WindowsRender extends Render {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
