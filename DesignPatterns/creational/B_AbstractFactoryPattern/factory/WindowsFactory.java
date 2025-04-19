package DesignPatterns.creational.B_AbstractFactoryPattern.factory;

import DesignPatterns.creational.B_AbstractFactoryPattern.models.button.Button;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.button.WindowsButton;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.dialog.Dialog;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.dialog.WindowsDialog;

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
