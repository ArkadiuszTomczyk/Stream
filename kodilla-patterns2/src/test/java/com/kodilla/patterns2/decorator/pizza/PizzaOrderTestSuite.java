package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculateCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(7), calculateCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza italiana", description);
    }

        @Test
    public void testRickPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new RickPizza(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(22), theCost);
    }

    @Test
    public void testRickPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new RickPizza(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza italiana + salt + mysterious things", description);
    }

    @Test
    public void testRickPizzaWithCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new RickPizza(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24), theCost);
    }
    @Test
    public void testRickPizzaWithCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new RickPizza(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza italiana + salt + mysterious things + extra cheese", description);
    }
}
