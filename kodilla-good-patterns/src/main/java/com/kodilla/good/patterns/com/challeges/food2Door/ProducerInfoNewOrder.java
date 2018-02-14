package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class ProducerInfoNewOrder {

    public ProducerInfo newOrder1(){

        final FoodProducer producer = new FoodProducer("ExtraFoodShop");

        final Map<String, Integer> orderedItem = new HashMap<>();
        orderedItem.put("carrots ", 10);
        orderedItem.put("onions ", 20);

        final NumberOfOrder numberOfOrder = new NumberOfOrder(1);

        return new ProducerInfo(producer, orderedItem, numberOfOrder);
    }

    public ProducerInfo newOrder2() {

        final FoodProducer producer = new FoodProducer("HealthyShop");

        final Map<String, Integer> orderedItem = new HashMap<>();
        orderedItem.put("tomatoes ", 17);
        orderedItem.put("potatoes ", 20);

        final NumberOfOrder numberOfOrder = new NumberOfOrder(1);

        return new ProducerInfo(producer, orderedItem, numberOfOrder);
    }

    public ProducerInfo newOrder3(){

        final FoodProducer producer = new FoodProducer("GlutenFreeShop");

        final Map<String, Integer> orderedItem = new HashMap<>();
        orderedItem.put("oranges ", 25);
        orderedItem.put("bananas ", 50);

        final NumberOfOrder numberOfOrder = new NumberOfOrder(1);


        return new ProducerInfo(producer, orderedItem, numberOfOrder);

    }
}
