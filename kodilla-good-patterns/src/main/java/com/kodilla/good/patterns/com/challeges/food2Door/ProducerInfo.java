package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.Map;

public class ProducerInfo {
    private final FoodProducer producer;
    private final Map<String, Integer> orderedItems;
    private final NumberOfOrder numberOfOrder;

    public ProducerInfo(final FoodProducer producer, final Map<String, Integer> orderedItems, final NumberOfOrder numberOfOrder) {
        this.producer = producer;
        this.orderedItems = orderedItems;
        this.numberOfOrder = numberOfOrder;
    }

    public FoodProducer getProducer() {
        return producer;
    }

    public Map<String, Integer> getOrderedItems() {
        return orderedItems;
    }

    public NumberOfOrder getNumberOfOrder() {
        return numberOfOrder;
    }
}
