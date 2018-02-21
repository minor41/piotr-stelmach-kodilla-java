package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.ArrayList;
import java.util.List;

public class Food2Door {

    private List<ProductProducer> producers = new ArrayList<>();

    public boolean placeOrder(Order order) {

        for (ProductProducer productProducer : producers) {
            if(productProducer.canHandleOrder(order)) {
                productProducer.process(order);
                return true;
            }
        }
        return false;
    }

    public void registerNewProducer(ProductProducer producer){
        this.producers.add(producer);
    }
}
