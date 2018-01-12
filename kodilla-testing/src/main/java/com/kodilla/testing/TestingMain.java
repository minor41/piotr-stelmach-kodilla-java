package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calulator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:" + "\n");


        // test klasy Kalkulator ->
        Calculator calculator = new Calculator();

        if (calculator == calculator) {
            System.out.println("result of adding equals: " + calculator.add(99, 1) + "\n");
        } else {
            System.out.println("calculator is not working");
        }

        if (calculator == calculator){
            System.out.println("result of subtracting equals: " + calculator.subtract(100,1));
        } else {
            System.out.println("calculator is not working");
        }




    }
}