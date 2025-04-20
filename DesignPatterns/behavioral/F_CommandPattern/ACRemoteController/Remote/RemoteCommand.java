package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote;

import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC.AirConditioner;

public abstract class RemoteCommand {
    AirConditioner airConditioner;

    public RemoteCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    abstract void execute();

    abstract void undo();
}
