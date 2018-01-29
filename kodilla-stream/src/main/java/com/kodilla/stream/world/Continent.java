package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String nameOfTheContinent;
    private final List<Country> listOfCountries = new ArrayList<>();

    public  Continent(final String nameOfTheContinent) {
        this.nameOfTheContinent = nameOfTheContinent;
    }

    public List<Country> getListOfCountries(){
        return  listOfCountries;
    }
}
