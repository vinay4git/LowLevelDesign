package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote;

import java.util.Stack;

public class RemoteCommandInvoker {
    private static final RemoteCommandInvoker remoteCommandInvoker = new RemoteCommandInvoker();
    RemoteCommand remoteCommand ;
    Stack<RemoteCommand> remoteCommands;

    private RemoteCommandInvoker() {
        remoteCommands = new Stack<>();
    }

    public static RemoteCommandInvoker getInstance(){
        return remoteCommandInvoker;
    }

    public  void setCommand(RemoteCommand remoteCommand) {
        this.remoteCommand = remoteCommand;
    }

    public  void execute(){
        remoteCommand.execute();
        remoteCommands.add(remoteCommand);
    }

    public  void undo() {
        if (!remoteCommands.isEmpty()) {
            RemoteCommand pop = remoteCommands.pop();
            pop.undo();
        }
    }
}
