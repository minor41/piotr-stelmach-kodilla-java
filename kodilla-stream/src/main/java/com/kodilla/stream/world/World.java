package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> listOfContinents = new ArrayList<>();

    public BigDecimal getPeopleQuantity(){
         BigDecimal totalPeople = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add());

         return totalPeople;
    }
}
