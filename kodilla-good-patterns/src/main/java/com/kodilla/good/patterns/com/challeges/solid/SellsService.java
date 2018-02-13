package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public interface SellsService {

    boolean createSells(User user, String nameOfProduct, int quantity, LocalDate whenSold,
                        LocalDate whenGotMoney, LocalDate whenShipped);

}
