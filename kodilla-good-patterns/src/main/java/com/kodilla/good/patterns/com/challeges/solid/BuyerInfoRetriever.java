package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public class BuyerInfoRetriever {

    public BuyerInfo retrieve(){

        User user = new User("John", "Kane", "j.Kane@o9.com");

        String nameOfProduct = "Game 1";
        int quantity = 1;

        LocalDate whenSold = LocalDate.of(2018, 01, 31);
        LocalDate whenGotMoney = LocalDate.of(2018, 1, 31);
        LocalDate whenShipped = LocalDate.of(2018, 2, 1);

        return new BuyerInfo(user, nameOfProduct, quantity, whenSold, whenGotMoney, whenShipped);

    }

    public BuyerInfo retrieve1(){

        User user1 = new User("Paul", "Doe", "p.doe@o9.com");

        String nameOfProduct = "Crocs";
        int quantity = 1;
        LocalDate whenSold = LocalDate.of(2018, 01, 31);
        LocalDate whenGotMoney = LocalDate.of(2018, 1, 31);
        LocalDate whenShipped = LocalDate.of(2018, 2, 1);

        return  new BuyerInfo(user1, nameOfProduct, quantity, whenSold, whenGotMoney, whenShipped);
    }


}
