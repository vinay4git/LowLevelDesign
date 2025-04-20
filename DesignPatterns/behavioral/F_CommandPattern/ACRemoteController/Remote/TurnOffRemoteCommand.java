package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote;

import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC.AirConditioner;

public class TurnOffRemoteCommand extends RemoteCommand {
    public TurnOffRemoteCommand(AirConditioner airConditioner) {
        super(airConditioner);
    }

    @Override
    void execute() {
        airConditioner.turnOff();
    }

    @Override
    void undo() {
        airConditioner.turnOn();
    }


}
