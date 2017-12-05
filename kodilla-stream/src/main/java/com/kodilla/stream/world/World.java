package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    private Set<Continent> continents = new HashSet<>();

    public Set<Continent> getContinents() {
        return continents;
    }

    public World() {
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }
    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(c -> c.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, delta) -> sum.add(delta));
    }
}
