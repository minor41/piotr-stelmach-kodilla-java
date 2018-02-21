package com.kodilla.good.patterns.com.challeges.food2Door;

public interface ProductProducer {
    boolean canHandleOrder(Order order);

     void process(Order order);
}
