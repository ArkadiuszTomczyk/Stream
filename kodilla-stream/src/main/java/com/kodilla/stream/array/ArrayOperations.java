package com.kodilla.stream.array;

import java.util.Arrays;


public interface ArrayOperations {
    static double getAverage(int[] numbers) {
    return Arrays.asList(numbers).stream()
            .mapToInt(n -> n)
            .average().orElse(0);
    }
}
