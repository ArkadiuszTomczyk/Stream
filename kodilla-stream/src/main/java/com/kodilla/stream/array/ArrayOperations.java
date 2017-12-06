package com.kodilla.stream.array;

import java.util.Arrays;


public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        Arrays.asList(numbers).stream().forEach(n -> System.out.println(n));
//                .mapToInt(n -> n)
//                .average().orElse(0);
                return 0;
    }
}
