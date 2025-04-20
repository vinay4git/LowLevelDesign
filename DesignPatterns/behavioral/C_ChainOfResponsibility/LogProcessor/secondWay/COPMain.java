package DesignPatterns.behavioral.C_ChainOfResponsibility.LogProcessor.secondWay;

public class COPMain {
    public static void main(String[] args) {
        LoggerProcessor logger = new InfoLogger(new DebugLogger(null));

        logger.logIt(LogType.ERROR, "I am logged as");
    }
}
