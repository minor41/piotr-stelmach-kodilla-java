package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumberExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


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
        OddNumberExterminator emptyList = new OddNumberExterminator();
        emptyList.exterminate(numbers);
        Assert.assertEquals(0, numbers);

    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
       // OddNumberExterminator evenNumbers = new OddNumberExterminator();


    }
}
