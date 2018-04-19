package com.kodilla.good.patterns.com.challeges.airports;

import java.time.LocalDate;
import java.util.Objects;

public class Flights {
    private final String flightNumber;
    private final Airports airport;
    private final LocalDate departureTime;
    private final LocalDate arrivalTime;

    public Flights(String flightNumber, Airports airport, LocalDate departureTime, LocalDate arrivalTime) {

        this.flightNumber = flightNumber;
        this.airport = airport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airports getAirport() {
        return airport;
    }

    public LocalDate getDepartureTime() {
        return departureTime;
    }

    public LocalDate getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(flightNumber, flights.flightNumber) &&
                Objects.equals(airport, flights.airport) &&
                Objects.equals(departureTime, flights.departureTime) &&
                Objects.equals(arrivalTime, flights.arrivalTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightNumber, airport, departureTime, arrivalTime);
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departure=" + airport.getDepartureAirport() +
                ", departureTime=" + departureTime +
                ", arrival=" + airport.getArrivalAirport() +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
