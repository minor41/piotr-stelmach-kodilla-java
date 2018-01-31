package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> listOfContinents = new ArrayList<>();

    public BigDecimal getPeopleQuantity(){
         BigDecimal totalPeople = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                 .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

         return totalPeople;
    }

    public void add(Continent continent) {
        this.listOfContinents.add(continent);
    }
}
