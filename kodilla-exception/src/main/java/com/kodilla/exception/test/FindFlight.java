package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        if (flight != null) {
            final Map<String, Boolean> findFlight = new HashMap<>();
            findFlight.put("new york", true);
            findFlight.put("atlanta", true);
            findFlight.put("santa monica", true);
            findFlight.put("chicago", false);
            findFlight.put("warsaw", true);
            findFlight.put("london", false);
            findFlight.put("paris", false);
            findFlight.put("szczecin", true);
        }
        if (flight == null) {
            throw new RouteNotFoundException();
        }
    }
}

class Test{

    public static void main(String args[]) {

   //    FindFlight lookForFlight = new FindFlight();
   //
   //    try {
   //        lookForFlight.findFlight();
   //
   //    } catch (RouteNotFoundException e) {
   //
   //        System.out.println("Route not found");
   //
   //    }finally {
   //
   //        System.out.println("Thank you for using our service");
   //    }
    }
}
