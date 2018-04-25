package com.kodilla.good.patterns.com.challeges.airports;

public class FlightApplication {
    public static void main(String[] args) {

        FlightProcessor flightProcessor = new FlightProcessor();
        try {
            flightProcessor.flightTo("Rome");
        } catch (RouteNotFoundException e) {
            System.out.println("\nNo flights found for requested connection \n");
        }
        try {
            flightProcessor.flightFrom("Berlin");

        } catch (RouteNotFoundException e) {
            System.out.println("\nNo flights found for requested connection \n");
        }

        try {
            flightProcessor.layoverFlights("Moscow", "Rome", "London");
        } catch (RouteNotFoundException e) {
            System.out.println("\nNo flights found for requested connection \n");
        }
    }
}
