package com.kodilla.good.patterns.com.challeges;

public class SellsDTO {
    public User user;
    public boolean isSold;

    public SellsDTO(User user, boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}
