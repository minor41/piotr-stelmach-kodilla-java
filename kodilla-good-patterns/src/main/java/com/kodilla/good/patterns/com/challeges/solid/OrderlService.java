package com.kodilla.good.patterns.com.challeges.solid;

public class OrderlService implements SellsService{

    @Override
    public boolean createSells(BuyerInfo buyerInfo) {
        System.out.println("Sold: " + buyerInfo.getNameOfProduct() + " Quantity: " + buyerInfo.getQuantity()
                + " to: " + buyerInfo.getFirstName() + " " + buyerInfo.getLastName() + " date of sale: " + buyerInfo.getWhenSold()
        + " date of receiving the money: " + buyerInfo.getWhenGotMoney() + " date of shipping the product: "
                + buyerInfo.getWhenShipped());
        return true;
    }
}
