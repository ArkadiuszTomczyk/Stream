package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    public void testAdd() {
        double result = calculator.add(45,456);
        Assert.assertEquals(501, result, 0);
    }

}
