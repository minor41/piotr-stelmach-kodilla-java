package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public class GameSellsRepository implements SellsRepository{

    @Override
    public boolean createSells(User user, String nameOfProduct, int quantity, LocalDate whenSold, LocalDate whenGotMoney, LocalDate whenShipped) {
        System.out.println("Stored Data: " + "\n" + "Sold: " + nameOfProduct+ " Quantity: " + quantity
                + " to: " + user.getName() + " " + user.getLastName() + " date of sale: " + whenSold
                + " date of receiving the money: " + whenGotMoney + " date of shipping the product: " + whenShipped + "\n");
        return true;
    }
}