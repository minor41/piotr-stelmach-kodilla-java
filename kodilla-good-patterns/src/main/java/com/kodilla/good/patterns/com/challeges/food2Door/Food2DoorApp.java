package com.kodilla.good.patterns.com.challeges.food2Door;

public class Food2DoorApp {

    public static void main(String[] args){

        ProducerInfoNewOrder producerInfoNewOrder1 = new ProducerInfoNewOrder();
        ProducerInfo producerInfo1 = producerInfoNewOrder1.newOrder1();

        OnlineFoodStore onlineFoodStore1 = new OnlineFoodStore(new FoodOrderServices());
        onlineFoodStore1.process(producerInfo1);

        ProducerInfoNewOrder producerInfoNewOrder2 = new ProducerInfoNewOrder();
        ProducerInfo producerInfo2 = producerInfoNewOrder2.newOrder2();

        OnlineFoodStore onlineFoodStore2 = new OnlineFoodStore(new FoodOrderServices());
        onlineFoodStore2.process(producerInfo2);

        ProducerInfoNewOrder producerInfoNewOrder3 = new ProducerInfoNewOrder();
        ProducerInfo producerInfo3 = producerInfoNewOrder3.newOrder3();


        OnlineFoodStore onlineFoodStore3 = new OnlineFoodStore(new FoodOrderServices());
        onlineFoodStore3.process(producerInfo3);

    }
}
