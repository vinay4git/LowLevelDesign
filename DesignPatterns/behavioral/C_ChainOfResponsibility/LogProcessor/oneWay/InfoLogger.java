package DesignPatterns.behavioral.C_ChainOfResponsibility.LogProcessor.oneWay;

public class InfoLogger extends LoggerProcessor {
    public InfoLogger(LoggerProcessor loggerProcessor) {
        nextLoggerProcessor = loggerProcessor;
    }

    @Override
    public void logIt(LogType logType, String message) {

        if (logType.equals(LogType.INFO)) {
            System.out.println("Info Logger" + message);
        } else {
            super.logIt(logType, message);
        }

    }
}
