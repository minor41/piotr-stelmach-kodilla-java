package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logging(){
        Logger.getInstance().log("mrSteep00900");
    }

    @AfterClass
    public static void logOut(){
        System.out.println("Session is over");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        Assert.assertEquals("mrSteep00900", lastLog);
    }
}
