package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddNumberExterminator {


   public void exterminate(List<Integer> numbers) {

       List<Integer> withoutOddNum = new ArrayList<>();
       for (Integer evenNumbers: numbers) {
           if (evenNumbers % 2 == 0) {
               withoutOddNum.add(evenNumbers);
           }
       }
   }
}
