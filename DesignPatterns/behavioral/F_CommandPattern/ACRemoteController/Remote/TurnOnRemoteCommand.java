package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote;

import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC.AirConditioner;

public class TurnOnRemoteCommand extends RemoteCommand {

    public TurnOnRemoteCommand(AirConditioner airConditioner) {
        super(airConditioner);
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }

    @Override
    void undo() {
        airConditioner.turnOff();
    }
}
