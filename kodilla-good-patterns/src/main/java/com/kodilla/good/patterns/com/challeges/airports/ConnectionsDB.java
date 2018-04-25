package com.kodilla.good.patterns.com.challeges.airports;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ConnectionsDB {

    public static List<Flight> getConnection() {

        final List<Flight> everydayConnections = new ArrayList<>();

        everydayConnections.add(new Flight("AA1", "Berlin", "Rome", LocalDate.now(),
                LocalTime.of(10, 00), LocalTime.of(12, 0)));
        everydayConnections.add(new Flight("AA2", "Berlin", "London", LocalDate.now(),
                LocalTime.of(11, 00), LocalTime.of(12, 30)));
        everydayConnections.add(new Flight("AA3", "Berlin", "Moscow", LocalDate.now(),
                LocalTime.of(10, 00), LocalTime.of(13, 30)));
        everydayConnections.add(new Flight("AA4", "London", "Rome", LocalDate.now(),
                LocalTime.of(13, 30), LocalTime.of(15, 30)));
        everydayConnections.add(new Flight("AA5", "London", "Berlin", LocalDate.now(),
                LocalTime.of(13, 03), LocalTime.of(14, 40)));
        everydayConnections.add(new Flight("AA6", "London", "Moscow", LocalDate.now(),
                LocalTime.of(10, 30), LocalTime.of(14, 30)));
        everydayConnections.add(new Flight("AA7", "Moscow", "Rome", LocalDate.now(),
                LocalTime.of(11, 30), LocalTime.of(14, 10)));
        everydayConnections.add(new Flight("AA8", "Moscow", "Berlin", LocalDate.now(),
                LocalTime.of(12, 00), LocalTime.of(14, 30)));
        everydayConnections.add(new Flight("AA9", "Moscow", "London", LocalDate.now(),
                LocalTime.of(10, 00), LocalTime.of(12, 00)));
        everydayConnections.add(new Flight("AA10", "Rome", "London", LocalDate.now(),
                LocalTime.of(10, 00), LocalTime.of(12, 00)));

        return new ArrayList<>(everydayConnections);
    }
}
