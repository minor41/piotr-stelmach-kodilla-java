package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calulator.Calculator;

public class TestingMain {
    public static void main(String[] args){


        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:" + "\n");


        // test klasy Kalkulator ->
        Calculator calculator = new Calculator();

        int adding = calculator.add(99, 1);
        int subtracting =calculator.subtract(100, 1);

            System.out.println("result of adding equals: " + adding + "\n");

            System.out.println("result of subtracting equals: " + subtracting);
        }
    }
