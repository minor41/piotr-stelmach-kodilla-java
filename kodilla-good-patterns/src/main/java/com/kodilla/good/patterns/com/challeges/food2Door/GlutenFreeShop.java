package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.Arrays;
import java.util.List;

public class GlutenFreeShop implements ProductProducer {
    private InformationService informationService;
    private List<String> productList = Arrays.asList(
            "GlutenFree Rice",
            "GlutenFree Pasta",
            "GlutenFree Candy"
    );

    public GlutenFreeShop(InformationService informationService) {
        this.informationService = informationService;
    }

    @Override
    public boolean canHandleOrder(Order order) {
        return productList.contains(order.getProductList());
    }

    @Override
    public void process(Order order) {

        System.out.println("GlutenFreeShop is processing the order: " + order);
        informationService.inform(order);

    }
}

