package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String countryName;
    private final Set<Continent> countries = new HashSet<>();

    public Continent(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public Set<Continent> getCountries() {
        return countries;
    }

    public void addCountry(Country country) {
    }
}
