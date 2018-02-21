package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public class OrderRepository implements SellsRepository{

    @Override
    public boolean createOrderRepository(BuyerInfo buyerInfo) {
        System.out.println("Store information about order: " + buyerInfo.getNameOfProduct() + " Quantity: " + buyerInfo.getQuantity()
                + " send to : " + buyerInfo.getFirstName() + " " + buyerInfo.getLastName() + " date of sale: "
                + buyerInfo.getWhenSold() + " date of receiving the money: " + buyerInfo.getWhenGotMoney()
                + " date of shipping the product: " + buyerInfo.getWhenShipped() + "\n");
        return true;
    }
}