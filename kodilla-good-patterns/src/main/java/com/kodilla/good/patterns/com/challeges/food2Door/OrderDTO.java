package com.kodilla.good.patterns.com.challeges.food2Door;

public class OrderDTO {

    public FoodProducer producer;
    public boolean newOrderPlaced;

    public OrderDTO(FoodProducer producer, boolean newOrderPlaced) {
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
