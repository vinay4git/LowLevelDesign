package creational.AbstractFactoryPattern.factory;

import creational.AbstractFactoryPattern.models.button.Button;
import creational.AbstractFactoryPattern.models.dialog.Dialog;

public interface UIFactory {

    Button createButton();

    Dialog createDialog();
}
