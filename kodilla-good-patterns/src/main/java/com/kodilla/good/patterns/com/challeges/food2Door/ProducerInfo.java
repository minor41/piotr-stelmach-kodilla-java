package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.Map;

public class ProducerInfo {
    private FoodProducer producer;
    private Map<String, Integer> orderedItems;

    public ProducerInfo(FoodProducer producer, Map<String, Integer> orderedItems) {
        this.producer = producer;
        this.orderedItems = orderedItems;
    }

    public FoodProducer getProducer() {
        return producer;
    }

    public Map<String, Integer> getOrderedItems() {
        return orderedItems;
    }
}
