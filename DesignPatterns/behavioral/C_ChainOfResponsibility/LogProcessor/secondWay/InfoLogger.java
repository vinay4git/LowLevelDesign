package DesignPatterns.behavioral.C_ChainOfResponsibility.LogProcessor.secondWay;

public class InfoLogger extends LoggerProcessor {
    public InfoLogger(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void logIt(LogType logType, String message) {

        if (logType.equals(LogType.INFO)) {
            System.out.println("Info Logger" + message);
        } else {
            nextLoggerProcessor.logIt(logType, message);
        }

    }
}
