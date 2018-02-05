package com.kodilla.exception.test;


public class ExceptionHandling extends SecondChallenge{

    public static void main(String args[]) {

        ExceptionHandling exceptionHandling = new ExceptionHandling();

        try {

            exceptionHandling.probablyIWillThrowException(2.0, 1.5);

        }catch (Exception e){

            System.out.println("exception");

        }finally {

            System.out.println("done");
        }
    }
}
