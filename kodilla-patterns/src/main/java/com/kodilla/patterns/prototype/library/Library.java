package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
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
    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBooks : books) {
            BooksList clonedList = new BooksList(theBooks.getName());
            for (Book book : theBooks.getBooks() {
                clonedLibrary.getBooks().add(book);
            }
            clonedLibrary.getBooks().add(clonedList);
        }
        return clonedLibrary;

    }
}