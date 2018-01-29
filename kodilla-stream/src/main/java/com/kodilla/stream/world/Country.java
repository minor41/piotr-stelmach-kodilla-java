package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String nameOfTheCountry;
    private final BigDecimal numberOfPeopleInTheCountry;

    public Country(final String nameOftheCountry,final BigDecimal numberOfPeopleInTheCountry){
        this.nameOfTheCountry = nameOftheCountry;
        this.numberOfPeopleInTheCountry = numberOfPeopleInTheCountry;
    }

    public String getNameOftheCountry(){
        return nameOfTheCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOftheCountry='" + nameOfTheCountry + '\'' +
                ", numberOfPeopleInTheCountry=" + numberOfPeopleInTheCountry +
                '}';
    }

    public BigDecimal getPeopleQuantity() {
        return numberOfPeopleInTheCountry;
    }
}
