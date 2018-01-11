package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLogger() {
        //Given
        Logger logger = Logger.getInstance();
        logger.log("zaloguj się ");

        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("zaloguj się ", result);
    }
}
