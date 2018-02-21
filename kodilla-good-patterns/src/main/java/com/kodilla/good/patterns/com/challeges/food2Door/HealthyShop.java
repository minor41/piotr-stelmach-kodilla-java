package com.kodilla.good.patterns.com.challeges.food2Door;

import java.util.Arrays;
import java.util.List;

public class HealthyShop implements ProductProducer {

    private InformationService informationService;
    private List<String> productList = Arrays.asList(
            "BioDiary Products ",
            "BioVeggie Products",
            "BioSkin Products"
    );

    public HealthyShop(InformationService informationService) {
        this.informationService = informationService;
    }

    @Override
    public boolean canHandleOrder(Order order) {
        return productList.contains(order.getProductList());
    }

    @Override
    public void process(Order order) {

        System.out.println("HealthyShop is processing the order: " + order);
        informationService.inform(order);

    }
}
