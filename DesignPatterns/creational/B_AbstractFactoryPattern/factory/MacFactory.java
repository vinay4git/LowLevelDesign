package DesignPatterns.creational.B_AbstractFactoryPattern.factory;

import DesignPatterns.creational.B_AbstractFactoryPattern.models.button.Button;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.button.MacButton;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.dialog.Dialog;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.dialog.MacDialog;

public class MacFactory implements UIFactory{
    Button macButton = new MacButton();
    Dialog macDialog = new MacDialog();

    @Override
    public Button createButton() {
        return macButton;
    }

    @Override
    public Dialog createDialog() {
        return macDialog;
    }
}
