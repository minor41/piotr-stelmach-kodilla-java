package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac(){
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burger(3)
                .roll("roll with sesame seeds")
                .sauce("secret BigMac sauce")
                .ingredients("lettuce")
                .ingredients("onions")
                .ingredients("cheese")
                .ingredients("shrimps")
                .ingredients("bacon")
                .build();
        System.out.println(bigmac);
        //when
        int quantityOfIngredients = bigmac.getIngredients().size();
        String kingOfRoll = bigmac.getRoll();
        //Then
        Assert.assertEquals(5, quantityOfIngredients);
        Assert.assertEquals("roll with sesame seeds", kingOfRoll);
    }
}
