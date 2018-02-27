package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){

        //Given
        Library library = new Library("Public Library");
        Book book1 = new Book("Achaja 1", "Ziemianski", LocalDate.of(2010, 4, 25));
        Book book2 = new Book("Zenek", "Martyniuk", LocalDate.of(1931,1,31));
        Book book3 = new Book("GhostInTheShell", "Heiko", LocalDate.of(1999, 12, 23));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //Making shallow copy
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Public library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Making deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Public library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        Set<Book> publicLibrary = library.getBooks();

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(clonedLibrary.getBooks(), publicLibrary);
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), publicLibrary);

    }
}
