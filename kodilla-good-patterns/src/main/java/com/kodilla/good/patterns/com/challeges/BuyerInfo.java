package com.kodilla.good.patterns.com.challeges;

import java.time.LocalDate;

public class BuyerInfo {

    public User user;
    public LocalDate whenSold;
    public LocalDate whenGotMoney;
    public LocalDate whenShipped;

    public BuyerInfo(final User user, final LocalDate whenSold, final LocalDate whenGotMoney,
                     final LocalDate whenShipped) {
        this.user = user;
        this.whenSold = whenSold;
        this.whenGotMoney = whenGotMoney;
        this.whenShipped = whenShipped;
    }

    public User getUser() {
        return user;
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
