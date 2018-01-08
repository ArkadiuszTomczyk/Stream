package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class testBigmacSuite {
    @Test
    public void testBurger() {
        //Given
        Bigmac bigmac = new Bigmac.BurgerBuilder()
                .ingredient("sałata")
                .ingredient("kalafior")
                .roll("z sezamem")
                .burger("kotlet")
                .ingredient("pomidor")
                .sauce("Barbecue")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
