package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.Map;

public class ProducerInfo {
    private final FoodProducer producer;
    private final Map<String, Integer> orderedItems;

    public ProducerInfo(final FoodProducer producer, final Map<String, Integer> orderedItems) {
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
