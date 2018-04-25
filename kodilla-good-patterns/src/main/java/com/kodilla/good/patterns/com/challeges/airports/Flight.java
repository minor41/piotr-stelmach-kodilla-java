package com.kodilla.good.patterns.com.challeges.airports;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Flight {
    final String flightNumber;
    final String departureAirport;
    final String arrivalAirport;
    final LocalDate dateOfFlight;
    final LocalTime departureTime;
    final LocalTime arrivalTime;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport, LocalDate dateOfFlight, LocalTime departureTime, LocalTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.dateOfFlight = dateOfFlight;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightNumber, flight.flightNumber) &&
                Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport) &&
                Objects.equals(dateOfFlight, flight.dateOfFlight) &&
                Objects.equals(departureTime, flight.departureTime) &&
                Objects.equals(arrivalTime, flight.arrivalTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightNumber, departureAirport, arrivalAirport, dateOfFlight, departureTime, arrivalTime);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", dateOfFlight=" + dateOfFlight +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
