package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] littList = {15, 59,789, 1589,1};

        //When
        double avg = ArrayOperations.getAverage(littList);

        //Then

        Assert.assertEquals(1587, avg, 1);

    }
}
