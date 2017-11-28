package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    addCountry(Country country) {
    }
    @Test

    public void testPeopleQ() {
        //Given
    Country poland = new Country("Poland", new BigDecimal("14525879"));
    Country holland = new Country("Holland", new BigDecimal("17654123"));
    Country egipt = new Country("Egipt", new BigDecimal("2357896413"));
    Country russia = new Country("Russia", new BigDecimal("123456789"));
    Country oman = new Country("Oman", new BigDecimal("345621"));
    Country india = new Country("India", new BigDecimal("987987987"));
    Country iran = new Country("Iran", new BigDecimal("456456123"));
    Country ghana = new Country("Ghana", new BigDecimal("12345789"));
    Country rpa = new Country("RPA", new BigDecimal("852741963"));
    Continent europe = new Continent("Europe");
    europe.addCountry(poland);
    europe.addCountry(holland);
    Continent asia = new Continent("Asia");
    asia.addCountry(russia);
    asia.addCountry(oman);
    asia.addCountry(india);
    asia.addCountry(iran);
    Continent africa = new Continent("Africa");
    africa.addCountry(egipt);
    africa.addCountry(ghana);
    africa.addCountry(rpa);
    World world = new World();
    world.addContinent(europe);
    world.addContinent(asia);
    world.addContinent(africa);
    //When
        BigDecimal peopleQuantity = BigDecimal.ZERO;
        for ();
    //Then
    BigDecimal expectedPeople = new BigDecimal()






    }
}
