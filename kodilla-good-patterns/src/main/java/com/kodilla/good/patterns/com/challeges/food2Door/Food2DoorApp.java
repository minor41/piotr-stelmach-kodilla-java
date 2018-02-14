package com.kodilla.good.patterns.com.challeges.food2Door;

public class Food2DoorApp {

    public static void main(String[] args){

        ProducerInfoRetriever producerInfoRetriever1 = new ProducerInfoRetriever();
        ProducerInfo producerInfo1 = producerInfoRetriever1.retriever1();

        OnlineFoodStore onlineFoodStore1 = new OnlineFoodStore(new HealthyFoodOrderServices());
        onlineFoodStore1.process(producerInfo1);

        ProducerInfoRetriever producerInfoRetriever2 = new ProducerInfoRetriever();
        ProducerInfo producerInfo2 = producerInfoRetriever2.retriever2();

        OnlineFoodStore onlineFoodStore2 = new OnlineFoodStore(new HealthyFoodOrderServices());
        onlineFoodStore2.process(producerInfo2);

        ProducerInfoRetriever producerInfoRetriever3 = new ProducerInfoRetriever();
        ProducerInfo producerInfo3 = producerInfoRetriever3.retriever3();

        OnlineFoodStore onlineFoodStore3 = new OnlineFoodStore(new HealthyFoodOrderServices());
        onlineFoodStore3.process(producerInfo3);

    }
}
