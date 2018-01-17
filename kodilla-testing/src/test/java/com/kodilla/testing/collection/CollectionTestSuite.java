package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumberExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        List<Integer> numbers = new ArrayList<>();
        OddNumberExterminator emptyList = new OddNumberExterminator();
        List<Integer> result = emptyList.exterminate(numbers);
        Assert.assertEquals(0, result.size());



    }
    @Test
    public void testOddNumbersExterminatorNormalList(){

        List<Integer> result = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        OddNumberExterminator evenNumbers = new OddNumberExterminator();
        List<Integer> onlyEvenNumbers = evenNumbers.exterminate(result);
        Assert.assertEquals(Arrays.asList(2, 4, 6, 8), onlyEvenNumbers);


    }
}
