package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book1;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book2;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book1> bookSet) {
        Map<BookSignature, Book2> bookMap = new HashMap<>();
        for (Book1 books : bookSet) {
            bookMap.put(new BookSignature(books.getSignature()),
                    new Book2(books.getAuthor(),
                            books.getTitle(),
                            books.getPublicationYear()));
        }
            return medianPublicationYear(bookMap);
    }
}
