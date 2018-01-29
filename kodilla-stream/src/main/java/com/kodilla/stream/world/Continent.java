package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    final List<Country> listOfCountries = new ArrayList<>();
    Country poland = new Country();
    Country germany = new Country();
    Country usa = new Country();


    public List<Country> getListOfCountries(){
        return  listOfCountries;
    }
}
