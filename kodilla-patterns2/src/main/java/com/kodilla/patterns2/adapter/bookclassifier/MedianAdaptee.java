package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book2;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics{
    @Override
    public int averagePublicationYear(Map<BookSignature, Book2> books) {
        Statistics bookStatistics1 = new Statistics();
        return bookStatistics1.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book2> books) {
        Statistics bookStatistics2 = new Statistics();
        return bookStatistics2.medianPublicationYear(books);
    }
}
