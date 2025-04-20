package DesignPatterns.creational.B_AbstractFactoryPattern.factory;

import DesignPatterns.creational.B_AbstractFactoryPattern.models.button.Button;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.button.WindowsButton;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.dialog.Dialog;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.dialog.WindowsDialog;

public class WindowsFactory implements UIFactory{
    Button windowsButton = new WindowsButton();
    Dialog windowsDialog = new WindowsDialog();
    @Override
    public Button createButton() {
        return windowsButton;
    }

    @Override
    public Dialog createDialog() {
        return windowsDialog;
    }
}
