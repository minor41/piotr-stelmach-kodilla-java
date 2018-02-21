package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public class BuyerInfo {

    private String firstName;
    private String lastName;
    private String nameOfProduct;
    private int quantity;
    private LocalDate whenSold;
    private LocalDate whenGotMoney;
    private LocalDate whenShipped;

    public BuyerInfo(final String firstName,final String lastName, final String nameOfProduct, final int quantity,
                     final LocalDate whenSold, final LocalDate whenGotMoney,
                     final LocalDate whenShipped) {
        this.firstName = firstName;
        this.lastName =lastName;
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
        this.whenSold = whenSold;
        this.whenGotMoney = whenGotMoney;
        this.whenShipped = whenShipped;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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
