package DesignPatterns.creational.AbstractFactoryPattern.factory;

import DesignPatterns.creational.AbstractFactoryPattern.models.button.Button;
import DesignPatterns.creational.AbstractFactoryPattern.models.button.WindowsButton;
import DesignPatterns.creational.AbstractFactoryPattern.models.dialog.Dialog;
import DesignPatterns.creational.AbstractFactoryPattern.models.dialog.WindowsDialog;

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
