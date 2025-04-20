package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote;

import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC.AirConditioner;

public class SetToSpecificTempRemoteCommand extends RemoteCommand{
    double toTemp;
    double oldTemp;
    public SetToSpecificTempRemoteCommand(AirConditioner airConditioner, double toTemp) {
        super(airConditioner);
        this.toTemp = toTemp;
    }

    @Override
    void execute() {
        oldTemp = airConditioner.getCurrentTemp();
        airConditioner.setToTemperature(toTemp);
    }

    @Override
    void undo() {
        toTemp = oldTemp;
        execute();
    }
}
