package DesignPatterns.behavioral.F_CommandPattern.ACRemoteController.Remote;

import java.util.Stack;

public class RemoteCommandInvoker extends RemoteCommand{
    private static final RemoteCommandInvoker REMOTE_COMMAND_INVOKER = new RemoteCommandInvoker();
    RemoteCommand remoteCommand ;
    Stack<RemoteCommand> remoteCommands = new Stack<>();

    private RemoteCommandInvoker() {
        super(null);
    }

    public static RemoteCommandInvoker getInstance(){
        return REMOTE_COMMAND_INVOKER;
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
