package com.vendavo.training.lombok.showcase.domain;

import lombok.extern.java.Log;

@Log
public class LogClass {

    public static void main(String[] args) {
        LogClass logClass = new LogClass();
        logClass.theMethod();
        log.severe("Some not so funny error stuff");
    }

    private void theMethod() {
        log.info("Some fancy message");
    }
}
