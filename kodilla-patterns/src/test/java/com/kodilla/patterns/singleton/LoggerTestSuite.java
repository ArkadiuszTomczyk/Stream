package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLogger() {
        //Given

        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(12, "janko");
    }
}
