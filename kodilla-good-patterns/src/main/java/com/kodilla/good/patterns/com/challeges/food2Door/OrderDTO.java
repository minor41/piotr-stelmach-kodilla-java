package com.kodilla.good.patterns.com.challeges.food2Door;

public class OrderDTO {
    private FoodProducer producer;
    private boolean newOrderPlaced;

    public OrderDTO(final FoodProducer producer, final boolean newOrderPlaced) {
        this.producer = producer;
        this.newOrderPlaced = newOrderPlaced;
    }

    public FoodProducer getProducer() {
        return producer;
    }

    public boolean newOrderPlaced() {
        return newOrderPlaced;
    }
}