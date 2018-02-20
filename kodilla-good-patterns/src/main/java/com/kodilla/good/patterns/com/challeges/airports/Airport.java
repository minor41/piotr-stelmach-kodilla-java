package com.kodilla.good.patterns.com.challeges.airports;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport {

    private final String airport;

    public Airport(String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airports = (Airport) o;
        return Objects.equals(airport, airports.airport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(airport);
    }

    @Override
    public String toString() {
        return "Airports{" +
                "airport='" + airport + '\'' +
                '}';
    }
}
