package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class LibraryTestSuite {
//    @Test
//    public void testGetBoosk() {
//        //Given
//        BooksList listopad = new BooksList("Library");
//        IntStream.iterate(1, n->n +1)
//                .limit(10)
//                .forEach(n->Library.getBooks().add(new Book("Atlas", "john", 1999.11.11)));

//        BooksList kwiecien = new BooksList("Library2");
//        IntStream.iterate(1, n->n +1)
//                .limit(10)
//                .forEach(n->Library2.getBooks().add(new Book("Atlas1", "john1", 1999.11.11)));

//        BooksList Library3 = new BooksList("Library3");
//        IntStream.iterate(1, n->n +1)
//                .limit(10)
//                .forEach(n->Library3.getBooks().add(new Book("Atlas2", "john2", 1999.11.11)));

//        BooksList Library4 = new BooksList("Library4");
//        IntStream.iterate(1, n->n +1)
//                .limit(10)
//                .forEach(n->Library4.getBooks().add(new Book("Atlas3", "john3", 1999.11.11)));

//        Library library =new Library("big");
//        library.getBooks().add(listopad);
//        library.getBooks().add(kwiecien);
//
//        Library clonedLibrary = null;
//        try {
//            clonedLibrary = library.shallowCopy();
//            clonedLibrary.setName("Project number 2");
//        } catch (CloneNotSupportedException e) {
//            System.out.println(e);
//        }
//
//        Library deepClonedLibrary = null;
//        try {
//            deepClonedLibrary = library.deepCopy();
//            deepClonedLibrary.setName("Project number 3");
//        } catch (CloneNotSupportedException e) {
//            System.out.println(e);
//        }
//        //When
//        library.getBooks().remove(listopad);
//
//        //then
//        System.out.println(library);
//        System.out.println(clonedLibrary);
//        System.out.println(deepClonedLibrary);
//        Assert.assertEquals(2,library.getBooks().size());
//        Assert.assertEquals(2, clonedLibrary.getBooks().size());
//        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());;
//        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
//        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
//    }
}
