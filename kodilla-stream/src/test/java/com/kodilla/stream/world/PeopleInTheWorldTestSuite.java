package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PeopleInTheWorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //given
        final Country country1 = new Country("Poland", BigDecimal.valueOf(48_000_000));
        final Country country2 = new Country("France", BigDecimal.valueOf(50_000_000));
        final Country country3 = new Country("Spain", BigDecimal.valueOf(60_000_000));
        final Country country4 = new Country("Japan", BigDecimal.valueOf(30_000_000));
        final Country country5 = new Country("Korea", BigDecimal.valueOf(20_000_000));

        final List<Continent> continents = new ArrayList<>();
        final Continent europe = new Continent("Europe");
        final Continent asia = new Continent("Asia");

        continents.add(europe);
        continents.add(asia);

        europe.addCountries(country1);
        europe.addCountries(country2);
        europe.addCountries(country3);
        asia.addCountries(country4);
        asia.addCountries(country5);


        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        BigDecimal numberOfPeople = world.getPeopleQuantity();


        Assert.assertEquals(numberOfPeople, BigDecimal.valueOf(208_000_000));

    }
}
