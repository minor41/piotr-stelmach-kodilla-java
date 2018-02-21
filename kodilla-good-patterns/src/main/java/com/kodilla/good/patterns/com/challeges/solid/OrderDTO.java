package com.kodilla.good.patterns.com.challeges.solid;

public class OrderDTO {
    public BuyerInfo buyerInfo;
    public boolean sold;

    public OrderDTO(BuyerInfo buyerInfo, boolean sold) {
        this.buyerInfo = buyerInfo;
        this.sold = sold;
    }
}
