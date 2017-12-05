package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Continent {
    private String continentName;
    private Set<Country> countries = new HashSet<>();

    public Continent(String countryName) {
        this.continentName = countryName;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

}
