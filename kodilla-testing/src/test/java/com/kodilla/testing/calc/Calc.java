package com.kodilla.testing.calc;

import com.kodilla.testing.calculator.Calculator;
import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

public class Calc {
    @Test
    public void testAdd() {
        //Given
        Calculator calculator = new Calculator();
        //When
        double sum =  calculator.add(12, 2);

        //Then

        Assert.assertEquals(14, sum, 0);
    }

}
