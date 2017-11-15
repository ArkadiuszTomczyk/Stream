package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import com.kodilla.testing.collection.OddNumbersExterminator;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test case begin ");
    }
    @After
    public void after() {
        System.out.println("test case end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        //When
        int result = OddNumbersExterminator.getNumbersEven(emptyList);
        //Then
        Assert.assertEquals(0, emptyList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> odd = new ArrayList<>();
        odd.add(13);
        odd.add(14);
        odd.add(22);
        odd.add(23);
        odd.add(1);
        odd.add(16);
        //When
        int result = OddNumbersExterminator.getNumbersEven(odd);
        //Then
        Assert.assertNotEquals(3, odd.size());
    }

}

