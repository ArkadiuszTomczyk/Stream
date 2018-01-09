package com.kodilla.patterns.prototype.library;

import java.util.ArrayList;
import java.util.List;

public final class BooksList {
    final String name;
    final List<Book> books = new ArrayList<>();

    public BooksList(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s ="  List [" + name + "]";
        for ( Book book : books) {
            s = s + "\n" +book.toString();
        }
        return s;
    }
}
