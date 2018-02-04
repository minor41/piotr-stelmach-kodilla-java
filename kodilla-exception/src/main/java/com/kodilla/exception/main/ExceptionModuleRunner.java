package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String args[]) {

        FileReader fileReader1 = new FileReader();
        //fileReader1.readFile1();

        FileReaderWithoutHandling fileReader2 = new FileReaderWithoutHandling();
       // fileReader2.readFile2();

        FileReader fileReader3 = new FileReader();

        try {

            fileReader3.readFile1();

        } catch (FileReaderException e) {

            System.out.println("Problem while reading a file");
        }

    }
}
