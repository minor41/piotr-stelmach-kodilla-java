package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public class SandalsSellsService implements SellsService{

    @Override
    public boolean createSells(User user, String nameOfProduct, int quantity, LocalDate whenSold, LocalDate whenGotMoney, LocalDate whenShipped) {
        System.out.println("Sold: " + nameOfProduct + " Quantity: " + quantity
                + " to: " + user.getName() + " " + user.getLastName() + " date of sale: " + whenSold
                + " date of receiving the money: " + whenGotMoney + " date of shipping the product: " + whenShipped);
        return true;
    }
}
