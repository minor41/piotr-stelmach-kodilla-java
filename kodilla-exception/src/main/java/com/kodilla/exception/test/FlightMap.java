package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightMap {

    private final Map<String, List<String>> flightMap = new HashMap<>();

    public void addNewFlight(Flight flight) {
        if(flightMap.get(flight.getDepartureAirport()) == null) {
            flightMap.put(flight.getDepartureAirport(), new ArrayList<>());
        }

        final List<String> flightsFromDepartureAirport = flightMap.get(flight.getDepartureAirport());

        flightsFromDepartureAirport.add(flight.getArrivalAirport());
    }


    public Boolean findFlight(String departure, String arrival) throws RouteNotFoundException{

        List <String> flightsFromDepartureAirport = flightMap.get(departure);

        if (flightsFromDepartureAirport != null || flightsFromDepartureAirport.equals(departure)) {
            return flightsFromDepartureAirport.equals(departure);
        }
        if (flightsFromDepartureAirport.contains(arrival)){
            return true;
        }

        for(String flight : flightsFromDepartureAirport){
            if (findFlight(flight, arrival)) {
                return true;
            }
        }
  
        throw new RouteNotFoundException();
  
    }
}

class Test {

    public static void main(String args[]) {

        final FlightMap flightMap = new FlightMap();

        flightMap.addNewFlight(new Flight("Warsaw", "Berlin"));
        flightMap.addNewFlight(new Flight("Warsaw", "London"));
        flightMap.addNewFlight(new Flight("London", "New York"));
        flightMap.addNewFlight(new Flight("New York", "Chicago"));

        try {

            final boolean flight = flightMap.findFlight("Warsaw", "Chicago");
            System.out.println("Flight: " + flight);

        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flight from Warsaw to Chicago");
        }finally {
            System.out.println("Thank you for using our service");
        }
    }
}
