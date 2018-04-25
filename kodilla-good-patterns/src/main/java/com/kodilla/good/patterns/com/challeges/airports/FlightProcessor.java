package com.kodilla.good.patterns.com.challeges.airports;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightProcessor {

    ConnectionsDB connectionsDB;

    public List<Flight> flightTo(String destination) {
        final List<Flight> finalAirport;

        finalAirport = connectionsDB.getConnection().stream()
                .filter(a -> a.arrivalAirport.equals(destination))
                .collect(Collectors.toList());

        if (finalAirport != null && finalAirport.size() > 0) {
            System.out.println("\nAll possible flights to: " + destination);
            finalAirport.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("\nNo flights found for requested connection \n");
        }
        return new ArrayList<>(finalAirport);
    }

    public List<Flight> flightFrom(String from) {
        final List<Flight> startingAirport;

        startingAirport = connectionsDB.getConnection().stream()
                .filter(a -> a.departureAirport.equals(from))
                .collect(Collectors.toList());

        if (startingAirport != null && startingAirport.size() > 0) {
            System.out.println("\nAll possible flights from: " + from);
            startingAirport.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("\nNo flights found for requested connection \n");
        }
        return new ArrayList<>(startingAirport);
    }

    public List<Flight> layoverFlights(String from, String destination, String via) {
        final List<Flight> layoverAirport;
        final List<Flight> finalAirport;

        layoverAirport = connectionsDB.getConnection().stream()
                .filter(a -> a.departureAirport.equals(from))
                .filter(c -> c.arrivalAirport.equals(via))
                .collect(Collectors.toList());
        finalAirport = connectionsDB.getConnection().stream()
                .filter(a -> a.departureAirport.equals(via))
                .filter(b -> b.arrivalAirport.equals(destination))
                .collect(Collectors.toList());

        layoverAirport.addAll(finalAirport);

        if (layoverAirport != null && finalAirport != null && layoverAirport.size() > 0 && finalAirport.size() > 0) {
            System.out.println("\nAll flights to: " + destination + " via: " + via + "\n");
            layoverAirport.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("\nNo flights found for requested connection \n");
        }
        return new ArrayList<>(layoverAirport);
    }
}
