package com.kodilla.good.patterns.com.challeges.airports;

import java.time.LocalDate;
import java.time.LocalTime;

public class FlightApplication {
    public static void main(String[] args) {

        FlightProcessor flightProcessor = new FlightProcessor();

        flightProcessor.flightTo("Rome");
        flightProcessor.flightFrom("Berlin");
        flightProcessor.layoverFlights("Moscow", "Rome", "London");
    }
}
