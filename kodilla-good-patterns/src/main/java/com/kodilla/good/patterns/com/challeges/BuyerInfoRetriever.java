package com.kodilla.good.patterns.com.challeges;

import java.time.LocalDate;

public class BuyerInfoRetriever {

    public BuyerInfo retrieve(){

        User user = new User("John", "Kane");

        LocalDate whenSold = LocalDate.of(2018, 01, 31);
        LocalDate whenGotMoney = LocalDate.of(2018, 1, 31);
        LocalDate whenShipped = LocalDate.of(2018, 2, 1);

        return new BuyerInfo(user, whenSold, whenGotMoney, whenShipped);

    }

    public BuyerInfo retrieve1(){

        User user1 = new User("Paul", "Doe");

        LocalDate whenSold = LocalDate.of(2018, 01, 31);
        LocalDate whenGotMoney = LocalDate.of(2018, 1, 31);
        LocalDate whenShipped = LocalDate.of(2018, 2, 1);

        return  new BuyerInfo(user1, whenSold, whenGotMoney, whenShipped);
    }


}
