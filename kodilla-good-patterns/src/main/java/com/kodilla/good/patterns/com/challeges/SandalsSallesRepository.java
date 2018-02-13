package com.kodilla.good.patterns.com.challeges;

import java.time.LocalDate;

public class SandalsSallesRepository implements SellsRepository{

    private String sandalBrand;
    private int sandalSize;

    public SandalsSallesRepository(String sandalBrand, int sandalSize) {
        this.sandalBrand = sandalBrand;
        this.sandalSize = sandalSize;
    }

    public String getSandalBrand() {
        return sandalBrand;
    }

    public int getSandalSize() {
        return sandalSize;
    }

    @Override
    public boolean createSells(User user, LocalDate whenSold, LocalDate whenGotMoney, LocalDate whenShipped) {
        System.out.println("Stored Data: " + "\n" + "Sold: " + sandalBrand + " Quantity: " + sandalSize
                + " to: " + user.getName() + " " + user.getLastName() + " date of sale: " + whenSold
                + " date of receiving the money: " + whenGotMoney + " date of shipping the product: " + whenShipped);
        return true;
    }
}