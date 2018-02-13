package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public class BuyerInfo {

    public User user;
    public String nameOfProduct;
    public int quantity;
    public LocalDate whenSold;
    public LocalDate whenGotMoney;
    public LocalDate whenShipped;

    public BuyerInfo(final User user, final String nameOfProduct, final int quantity,
                     final LocalDate whenSold, final LocalDate whenGotMoney,
                     final LocalDate whenShipped) {
        this.user = user;
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
        this.whenSold = whenSold;
        this.whenGotMoney = whenGotMoney;
        this.whenShipped = whenShipped;
    }

    public User getUser() {
        return user;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getWhenSold() {
        return whenSold;
    }

    public LocalDate getWhenGotMoney() {
        return whenGotMoney;
    }

    public LocalDate getWhenShipped() {
        return whenShipped;
    }
}
