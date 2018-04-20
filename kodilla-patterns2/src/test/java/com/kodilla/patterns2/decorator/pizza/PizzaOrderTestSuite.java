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
        BigDecimal cost = theOrder.getCost();
        System.out.println(cost);
        //Then
        assertEquals(new BigDecimal(10), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Crust, tomato sauce, cheese", description);
    }

    @Test
    public void testHawaiianPizzaOrderDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiianPizzaOrderDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        System.out.println(cost);
        //Then
        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testHawaiianPizzaOrderDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiianPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Crust, tomato sauce, cheese, ham, pineapple", description);
    }

    @Test
    public void testMeatLoversExtraCheeseThickCrustPizzaOrderDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatLoversPizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new ThickCrustPizzaOrderDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        System.out.println(cost);
        //Then
        assertEquals(new BigDecimal(40), cost);
    }
    @Test
    public void testMeatLoversExtraCheeseThickCrustPizzaOrderDecoratorGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MeatLoversPizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new ThickCrustPizzaOrderDecorator(theOrder);
        //When
       String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Crust, tomato sauce, cheese, ham, bacon, beef, pepperoni," +
                " sausage, extra cheese + thick crust", description);
    }
    @Test
    public void test
}
