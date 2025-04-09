package DesignPatterns.creational.AbstractFactoryPattern.factory;

import DesignPatterns.creational.AbstractFactoryPattern.models.button.Button;
import DesignPatterns.creational.AbstractFactoryPattern.models.dialog.Dialog;

public interface UIFactory {

    Button createButton();

    Dialog createDialog();
}
