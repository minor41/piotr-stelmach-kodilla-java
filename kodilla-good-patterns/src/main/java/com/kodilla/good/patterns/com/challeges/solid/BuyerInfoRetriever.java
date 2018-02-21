package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public class BuyerInfoRetriever {

    public BuyerInfo retrieve(){


        String firstName = "John";
        String lastName = "Kane";

        String nameOfProduct = "Robin Hood";
        int quantity = 1;

        LocalDate whenSold = LocalDate.of(2018, 1, 31);
        LocalDate whenGotMoney = LocalDate.of(2018, 1, 31);
        LocalDate whenShipped = LocalDate.of(2018, 2, 1);

        return new BuyerInfo(firstName, lastName, nameOfProduct, quantity, whenSold, whenGotMoney, whenShipped);

    }

    public BuyerInfo retrieve1(){

        String firstName = "Paul";
        String lastName = "Doe";

        String nameOfProduct = "Crocs";
        int quantity = 1;
        LocalDate whenSold = LocalDate.of(2018, 1, 31);
        LocalDate whenGotMoney = LocalDate.of(2018, 1, 31);
        LocalDate whenShipped = LocalDate.of(2018, 2, 1);

        return  new BuyerInfo(firstName, lastName, nameOfProduct, quantity, whenSold, whenGotMoney, whenShipped);
    }


}
