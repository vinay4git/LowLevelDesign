package DesignPatterns.creational.B_AbstractFactoryPattern.factory;

import DesignPatterns.creational.B_AbstractFactoryPattern.models.button.Button;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.button.MacButton;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.dialog.Dialog;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.dialog.MacDialog;

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
