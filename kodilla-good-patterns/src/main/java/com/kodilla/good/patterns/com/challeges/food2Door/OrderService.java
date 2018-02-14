package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.Map;

public interface OrderService {

    boolean createOrder(FoodProducer producer, Map<String, Integer> orderedItems);
}
