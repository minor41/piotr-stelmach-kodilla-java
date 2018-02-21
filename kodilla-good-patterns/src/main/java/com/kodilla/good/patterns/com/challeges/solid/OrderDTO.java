package com.kodilla.good.patterns.com.challeges.solid;

public class OrderDTO {
    public BuyerInfo buyerInfo;
    public boolean ifSold;

    public OrderDTO(BuyerInfo buyerInfo, boolean isSold) {
        this.buyerInfo = buyerInfo;
        this.ifSold = isSold;
    }
}
