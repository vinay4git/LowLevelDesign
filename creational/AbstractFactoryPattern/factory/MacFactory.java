package creational.AbstractFactoryPattern.factory;

import creational.AbstractFactoryPattern.models.button.Button;
import creational.AbstractFactoryPattern.models.button.MacButton;
import creational.AbstractFactoryPattern.models.dialog.Dialog;
import creational.AbstractFactoryPattern.models.dialog.MacDialog;

public class MacFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Dialog createDialog() {
        return new MacDialog();
    }
}
