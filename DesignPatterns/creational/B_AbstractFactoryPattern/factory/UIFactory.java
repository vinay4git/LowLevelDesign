package DesignPatterns.creational.B_AbstractFactoryPattern.factory;

import DesignPatterns.creational.B_AbstractFactoryPattern.models.button.Button;
import DesignPatterns.creational.B_AbstractFactoryPattern.models.dialog.Dialog;

public interface UIFactory {

    Button createButton();

    Dialog createDialog();
}
