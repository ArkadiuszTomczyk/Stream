package com.kodilla.good.patterns.challenges;

import org.junit.Test;
import java.util.stream.Collectors;

public class MovieStoreTest {
    @Test
    public void testGetMovies() {
        MovieStore ms = new MovieStore();

        String s = ms.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(s);


    }

}