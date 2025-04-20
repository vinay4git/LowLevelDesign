package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController;

import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC.AirConditioner;
import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.AC.BlueStarAC;
import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote.RemoteCommand;
import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote.RemoteCommandInvoker;
import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote.SetToSpecificTempRemoteCommand;
import DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote.TurnOnRemoteCommand;

public class ACRemoteMain {
    public static void main(String[] args) {
        RemoteCommandInvoker commandController = RemoteCommandInvoker.getInstance();

        AirConditioner ac = new BlueStarAC();

        RemoteCommand turnOnRemoteCommand = new TurnOnRemoteCommand(ac);
        commandController.setCommand(turnOnRemoteCommand);
        commandController.execute();
        commandController.undo();

        System.out.println(ac.getCurrentTemp());
        RemoteCommand setToSpecificTempRemoteCommand = new SetToSpecificTempRemoteCommand(ac, 25);
        commandController.setCommand(setToSpecificTempRemoteCommand);
        commandController.execute();
        System.out.println(ac.getCurrentTemp());
    }
}
