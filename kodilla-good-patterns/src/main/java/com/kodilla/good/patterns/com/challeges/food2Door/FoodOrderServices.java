package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.Map;

public class FoodOrderServices implements OrderService{

    @Override
    public boolean createOrder(final FoodProducer producer, final Map<String, Integer> orderedItems, final NumberOfOrder numberOfOrder) {
        System.out.println("Ordered new products from: " + producer.getProducer() + " ordered items: " + orderedItems
                + "\n" + "Order number: " + numberOfOrder.getNumberOfOrder() + "\n");
        return true;
    }
}
