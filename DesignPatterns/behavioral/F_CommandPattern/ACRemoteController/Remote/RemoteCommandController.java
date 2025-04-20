package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote;

import java.util.Stack;

public class RemoteCommandController extends RemoteCommand{
    private static final RemoteCommandController remoteCommandController = new RemoteCommandController();
    RemoteCommand remoteCommand ;
    Stack<RemoteCommand> remoteCommands = new Stack<>();

    private RemoteCommandController() {
        super(null);
    }

    public static RemoteCommandController getInstance(){
        return  remoteCommandController;
    }

    public  void setCommand(RemoteCommand remoteCommand) {
        this.remoteCommand = remoteCommand;
    }

    @Override
    public  void execute(){
        remoteCommand.execute();
        remoteCommands.add(remoteCommand);
    }

    @Override
    public  void undo() {
        if (!remoteCommands.isEmpty()) {
            RemoteCommand pop = remoteCommands.pop();
            pop.undo();
        }
    }
}
