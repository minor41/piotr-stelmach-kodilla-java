package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public class GamesSellsService implements SellsService{

    @Override
    public boolean createSells(User user, String nameOfProduct, int quantity, LocalDate whenSold, LocalDate whenGotMoney, LocalDate whenShipped) {
        System.out.println("Sold: " + nameOfProduct + " Quantity: " + quantity
                + " to: " + user.getName() + " " + user.getLastName() + " date of sale: " + whenSold.toString()
        + " date of receiving the money: " + whenGotMoney.toString() + " date of shipping the product: "
                + whenShipped.toString());
        return true;
    }
}
