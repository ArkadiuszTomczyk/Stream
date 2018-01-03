package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerInstance = null;
    private String lastLog = "";

    public static Logger getInstance() {
        if ( loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void log(String log) {
        lastLog = log;
        log = "janko";

    }

    public String getLastLog() {
        return lastLog;
    }
}
