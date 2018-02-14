package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class ProducerInfoRetriever {

    public ProducerInfo retriever1(){

        FoodProducer producer = new FoodProducer("ExtraFoodShop");

        Map<String, Integer> orderedItem = new HashMap<>();
        orderedItem.put("carrots ", 10);
        orderedItem.put("onions ", 20);

        return new ProducerInfo(producer, orderedItem);
    }

    public ProducerInfo retriever2() {

        FoodProducer producer = new FoodProducer("HealthyShop");

        Map<String, Integer> orderedItem = new HashMap<>();
        orderedItem.put("tomatoes ", 17);
        orderedItem.put("potatoes ", 20);

        return new ProducerInfo(producer, orderedItem);
    }

    public ProducerInfo retriever3(){

        FoodProducer producer = new FoodProducer("GlutenFreeShop");

        Map<String, Integer> orderedItem = new HashMap<>();
        orderedItem.put("oranges ", 25);
        orderedItem.put("bananas ", 50);

        return new ProducerInfo(producer, orderedItem);

    }
}
