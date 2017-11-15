package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private static List<Integer> emptyList;
    private static List <Integer> fullList;

    public static List<Integer> exterminate(ArrayList<Integer> numbers) {
        List<Integer> numbersEven = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int n = 0; n < numbers.size(); n++) {
           if (numbers.get(n) % 2 == 0) {
                numbersEven.add(numbers.get(n));
            }
        }
        return numbersEven;

    }

    public static int getNumbersEven(List<Integer> emptyList) {
        OddNumbersExterminator.emptyList = emptyList;
        return 0;
    }
    public static List<Integer> getNumberEven(List<Integer> fullList) {
        OddNumbersExterminator.fullList = fullList;
        return fullList;
    }
}