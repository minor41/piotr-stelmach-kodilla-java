package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){
            if (titleFragment.length() < 3) {
                return new ArrayList<>();
            }

            final List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

            return resultList.stream()
                    .limit(20)
                    .collect(Collectors.toList());
        }

    //   List<Book> bookList = new ArrayList<Book>();
    //   if (titleFragment.length() < 3)
    //       return bookList;
    //   List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
    //   if (resultList.size() > 20)
    //       return bookList;
    //   bookList = resultList;
    //   return bookList;

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        return libraryDatabase.listBooksInHandsOf(libraryUser);
    }
}

