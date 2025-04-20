package DesignPatterns.behavioral.C_ChainOfResponsibility.LogProcessor.secondWay;

public abstract class LoggerProcessor {
    protected LoggerProcessor nextLoggerProcessor;

    public LoggerProcessor(LoggerProcessor nextLoggerProcessor) {
        this.nextLoggerProcessor = nextLoggerProcessor;
    }

    public void logIt(LogType logType, String message) {
        System.out.println("No handler configured for this type");
    }
}
