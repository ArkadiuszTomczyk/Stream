package com.kodilla.exception.test;

import java.util.List;
import java.util.Map;
import  java.util.HashMap;
import java.util.stream.Collectors;


public class FlightBrowser {

    public  boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airport1 = new HashMap<>();
        airport1.put("Mińsk", true);
        airport1.put("Gdańsk", true);
        airport1.put("Warszawa", false);
        airport1.put("Czeladź", false);
        List<Boolean> resultList = airport1.entrySet().stream()
                .filter(e -> e.getKey().equals(flight.getArrivalAirport()))
                .map(e -> e.getValue())
                .collect(Collectors.toList());
        if (resultList.size() == 0) {
            throw new RouteNotFoundException("Flight not found");
        } else {
            return resultList.get(0);
        }

    }
}
