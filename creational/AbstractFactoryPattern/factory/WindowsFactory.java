package creational.AbstractFactoryPattern.factory;

import creational.AbstractFactoryPattern.models.button.Button;
import creational.AbstractFactoryPattern.models.button.WindowsButton;
import creational.AbstractFactoryPattern.models.dialog.Dialog;
import creational.AbstractFactoryPattern.models.dialog.WindowsDialog;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Dialog createDialog() {
        return new WindowsDialog();
    }
}
