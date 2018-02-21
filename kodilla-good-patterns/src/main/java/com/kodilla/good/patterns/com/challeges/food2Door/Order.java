package com.kodilla.good.patterns.com.challeges.food2Door;

public class Order {

    private String productList;

    public Order(String productList) {
        this.productList = productList;
    }

    public String getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Product List= " + productList;
    }
}
