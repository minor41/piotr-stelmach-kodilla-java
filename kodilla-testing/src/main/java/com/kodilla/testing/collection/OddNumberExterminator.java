package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class OddNumberExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

     for (Integer evenNumbers: numbers) {
         if ( evenNumbers % 2 == 0) {
             numbers.add(evenNumbers);
         }
       }
       return numbers;
    }

}
