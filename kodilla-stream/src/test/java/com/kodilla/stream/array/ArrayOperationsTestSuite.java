package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //given
        final int[] numbers = new int[20];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 10;
        numbers[8] = 11;
        numbers[9] = 12;
        numbers[10] = 20;
        numbers[11] = 30;
        numbers[12] = 10;
        numbers[13] = 15;
        numbers[14] = 21;
        numbers[15] = 25;
        numbers[16] = 99;
        numbers[17] = 50;
        numbers[18] = 9;
        numbers[19] = 8;

        //when

        double average = ArrayOperations.getAverage(numbers);

        //assert
        Assert.assertEquals(17.4, average, 0);



    }
}
