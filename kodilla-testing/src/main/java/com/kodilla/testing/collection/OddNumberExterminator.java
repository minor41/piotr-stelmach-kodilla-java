package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class OddNumberExterminator {

    public Integer exterminate(ArrayList<Integer> numbers) {

     int numbersGroup = 10;
     ArrayList<Integer> withoutOddNum = new ArrayList<>();
     for (int i = 0; i < numbersGroup; i++) {
         if ( numbersGroup % 2 == 0) {
             withoutOddNum.add(numbersGroup);
         }
       }
       return numbers.size();
    }

}
