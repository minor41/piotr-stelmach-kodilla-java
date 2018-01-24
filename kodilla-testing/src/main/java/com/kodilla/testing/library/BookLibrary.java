package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3)
            return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20)
            return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        List<Book> bookList1 = new ArrayList<>();
        for (int n = 0; n < 5; n++) {
            if (bookList1.size() == 0){
                return bookList1;
            } else {
                if (bookList1.size() ==1) {
                    return bookList1;
                } else {
                    if (bookList1.size() ==5) {
                        return bookList1;
                    }
                }
            }
        }
        return bookList1;
    }
}

