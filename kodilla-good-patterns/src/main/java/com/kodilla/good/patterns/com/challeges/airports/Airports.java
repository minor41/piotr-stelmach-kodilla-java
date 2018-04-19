package com.kodilla.good.patterns.com.challeges.airports;

import java.util.Objects;

public class Airports {
    private final String departureAirport;
    private final String arrivalAirport;

    public Airports(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

}
