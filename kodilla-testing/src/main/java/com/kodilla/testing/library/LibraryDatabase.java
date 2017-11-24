package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {


    // list books borrowed by libraryUser
    List<Book> listBookInHandsOf(LibraryUser libraryUser);
    // try to rent a book for libraryUser
    // returns true when success
    // and returns false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    int returnBooks(LibraryUser libraryUser);

    List<Book> listBooksWithCondition(String titleFragment);



}
