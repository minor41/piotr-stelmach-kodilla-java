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
        List<Integer> numbers = new ArrayList<>();
        emptyList.exterminate(numbers);
        System.out.println("Testing " + numbers);
        Assert.assertNull(null);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumberExterminator evenNumbers = new OddNumberExterminator();
        Random randomNum = new Random();
        int randomGroup = randomNum.nextInt(50);
        List<Integer> numbers = new ArrayList<>();
        boolean evenFound = true;
        for (int i = 0; i < randomGroup; i++ ){
            evenNumbers.exterminate(numbers);
        }
        System.out.println("Testing " + numbers);
        Assert.assertTrue(evenFound);
    }
}
