package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String nameOftheCountry;
    private final BigDecimal numberOfPeopleInTheCountry;

    public Country(final String nameOftheCountry,final BigDecimal numberOfPeopleInTheCountry){
        this.nameOftheCountry = nameOftheCountry;
        this.numberOfPeopleInTheCountry = numberOfPeopleInTheCountry;
    }

    public String getNameOftheCountry(){
        return nameOftheCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOftheCountry='" + nameOftheCountry + '\'' +
                ", numberOfPeopleInTheCountry=" + numberOfPeopleInTheCountry +
                '}';
    }

    public BigDecimal getPeopleQuantity() {
        return numberOfPeopleInTheCountry;
    }
}
