package com.kodilla.good.patterns.com.challeges.solid;

import java.time.LocalDate;

public interface SellsRepository {

    boolean createSells(User user, LocalDate whenSold,
                        LocalDate whenGotMoney, LocalDate whenShipped);
}
