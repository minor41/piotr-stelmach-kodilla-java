package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){

        //Given
        Library library = new Library("Public Library");
        Book book1 = new Book("Achaja 1", "Ziemianski", LocalDate.of(2010, 4, 25));
       // Book book2 = new Book("")
    }
}
