package com.kodilla.testing.library;

import com.sun.javaws.jnl.LibraryDesc;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testUserWithZeroBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("Piotr ", "Doe ", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(user1))
                .thenReturn(new ArrayList<>());

        //When
        List<Book> noBooks = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(0, noBooks.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user1);
    }

    @Test
    public void testUserWith1Book() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        ArrayList<Book> listWith1Books = new ArrayList<>();
        Book book1 = new Book("mam ", "nadzieje ", 1984);
        listWith1Books.add(book1);
        LibraryUser user1 = new LibraryUser("Piotr ", "Doe ", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(listWith1Books);

        //When
        List<Book> userWith1Books = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(1, userWith1Books.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user1);
    }

    @Test
    public void testUserWithFiveBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> fiveBooks = new ArrayList<>();
        Book book1 = new Book("a", "b", 2000);
        Book book2 = new Book("a", "b", 2000);
        Book book3 = new Book("a", "b", 2000);
        Book book4 = new Book("a", "b", 2000);
        Book book5 = new Book("a", "b", 2000);
        fiveBooks.add(book1);
        fiveBooks.add(book2);
        fiveBooks.add(book3);
        fiveBooks.add(book4);
        fiveBooks.add(book5);

        LibraryUser user1 = new LibraryUser("Piotr ", "Doe ", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(fiveBooks);

        //When
        List<Book> userWith5Books = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(5, userWith5Books.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user1);
    }
}