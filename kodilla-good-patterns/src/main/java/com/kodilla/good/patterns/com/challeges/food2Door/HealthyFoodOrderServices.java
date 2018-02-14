package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.Map;

public class HealthyFoodOrderServices implements OrderService{

    @Override
    public boolean createOrder(final FoodProducer producer, final Map<String, Integer> orderedItems) {
        System.out.println("Ordered new products from: " + producer.getProducer() + " ordered items: " + orderedItems + "\n");
        return true;
    }
}
