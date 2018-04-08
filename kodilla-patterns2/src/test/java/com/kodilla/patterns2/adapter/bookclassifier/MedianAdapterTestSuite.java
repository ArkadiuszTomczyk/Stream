package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        books.add(new Book("Unknow author", "Book without title", 2000, "goodenough"));
        books.add(new Book("Author one", "Strange title", 2001, "best for horses"));
        books.add(new Book("Author two", "Easy title", 2002, "best for cats"));

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        Assert.assertEquals(2001, median);
    }
}
