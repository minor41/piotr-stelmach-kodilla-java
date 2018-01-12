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

        Calculator calculator = new Calculator();

        int result2 = calculator.add(5,7);

        int result3 = calculator.subtract(9,3);

        if (calculator.equals(calculator)) {
            System.out.println("result of adding equals: " + result2 + "\n");
        } else {
            System.out.println("calculator is not working");
        }

        if (calculator.equals(calculator)){
            System.out.println("result of subtracting equals: " + result3);
        } else {
            System.out.println("calculator is not working");
        }




    }
}