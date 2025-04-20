package DesignPatterns.behavioral.C_ChainOfResponsibility.LogProcessor.oneWay;

public abstract class LoggerProcessor {
    protected LoggerProcessor nextLoggerProcessor;

    public LoggerProcessor(LoggerProcessor nextLoggerProcessor) {
        this.nextLoggerProcessor = nextLoggerProcessor;
    }

    public void logIt(LogType logType, String message) {
        if (nextLoggerProcessor != null) {
            nextLoggerProcessor.logIt(logType, message);
        } else {
            System.out.println("No Log is configured for this type");
        }
    }
}
