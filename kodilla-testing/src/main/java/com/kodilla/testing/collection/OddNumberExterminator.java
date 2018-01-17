package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {


    public List<Integer> exterminate(List<Integer> numbers) {

     List<Integer> result = new ArrayList<>();

     for (Integer evenNumbers: numbers) {
         if ( evenNumbers % 2 == 0) {
             result.add(evenNumbers);
         }
       }
       return result;
    }

}
