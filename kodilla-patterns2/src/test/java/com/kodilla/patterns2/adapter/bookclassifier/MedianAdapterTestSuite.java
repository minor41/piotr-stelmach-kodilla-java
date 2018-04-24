package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book1;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Book1 book1 = new Book1("Author1", "Title1", 1980, "Sig1");
        Book1 book2 = new Book1("Author2", "Title2", 1990, "Sig2");
        Book1 book3 = new Book1("Author3", "Title3", 2000, "Sig3");
        Book1 book4 = new Book1("Author4", "Title4", 2010, "Sig4");
        Set<Book1> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        //When
        int median = adapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(2000, median);
    }
}

