package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    private final Set<World> continents = new HashSet<>();
    private final String contiNames;

    public Set<World> getContinents() {
        return continents;
    }

    public World(String contiNames) {
        this.contiNames = contiNames;
    }

    public String getContiNames() {
        return contiNames;
    }

    public void addContinent(Continent continent) {
    }
    public Set<String> getPeopleQuantity() {
        return continents.stream()
                .flatMap(continents -> continents.getPeopleQuantity().stream())
                .reduce(BigDecimal.ZERO, )
    }
}
