package com.kodilla.good.patterns.com.challeges.airports;

import java.util.List;

public class ListOfAirports {

    private final List<Airport> departureAirports;
    private final List<Airport> arrivalAirports;
    private final List<Airport> layoverAirports;

    public ListOfAirports(List<Airport> departureAirports, List<Airport> arrivalAirports, List<Airport> layoverAirports) {
        this.departureAirports = departureAirports;
        this.arrivalAirports = arrivalAirports;
        this.layoverAirports = layoverAirports;
    }

    public List<Airport> getDepartureAirports() {
        return departureAirports;
    }

    public List<Airport> getArrivalAirports() {
        return arrivalAirports;
    }

    public List<Airport> getLayoverAirports() {
        return layoverAirports;
    }
}
