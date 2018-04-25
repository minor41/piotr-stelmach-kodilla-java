package com.kodilla.good.patterns.com.challeges.airports;

import java.time.LocalDate;

public class FlightRequest {
    public final String passenger;
    public final String flightFrom;
    public final String layover;
    public final String destination;
    public final LocalDate travelDate;

    public FlightRequest(String passenger, String flightFrom, String layover,
                         String destination, LocalDate travelDate) {
        this.passenger = passenger;
        this.flightFrom = flightFrom;
        this.layover = layover;
        this.destination = destination;
        this.travelDate = travelDate;
    }

    public FlightRequest flightRequest(){
        FlightRequest flightRequest = new FlightRequest("John Smith", "Moscow", "Rome",
                "London", LocalDate.now());
        return flightRequest;
    }
}
