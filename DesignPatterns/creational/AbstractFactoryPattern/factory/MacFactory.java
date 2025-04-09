package DesignPatterns.creational.AbstractFactoryPattern.factory;

import DesignPatterns.creational.AbstractFactoryPattern.models.button.Button;
import DesignPatterns.creational.AbstractFactoryPattern.models.button.MacButton;
import DesignPatterns.creational.AbstractFactoryPattern.models.dialog.Dialog;
import DesignPatterns.creational.AbstractFactoryPattern.models.dialog.MacDialog;

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
