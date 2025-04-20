package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController;

import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC.AirConditioner;
import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC.BlueStarAC;
import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote.RemoteCommandController;
import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote.TurnOnRemoteCommand;

public class ACRemoteMain {
    public static void main(String[] args) {
        RemoteCommandController commandController = RemoteCommandController.getInstance();

        AirConditioner ac = new BlueStarAC();

        TurnOnRemoteCommand turnOnRemoteCommand = new TurnOnRemoteCommand(ac);
        commandController.setCommand(turnOnRemoteCommand);
        commandController.execute();
        commandController.undo();

    }
}
