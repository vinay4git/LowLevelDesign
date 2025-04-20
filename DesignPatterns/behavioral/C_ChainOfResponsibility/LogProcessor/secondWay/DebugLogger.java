package DesignPatterns.behavioral.C_ChainOfResponsibility.LogProcessor.secondWay;

public class DebugLogger extends LoggerProcessor {
    public DebugLogger(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void logIt(LogType logType, String message) {
        if (logType.equals(LogType.DEBUG)) {
            System.out.println("Debug Logger" + message);
        } else {
            nextLoggerProcessor.logIt(logType, message);
        }
    }
}
