package DesignPatterns.behavioral.G_IteratorPattern.Library;

import DesignPatterns.behavioral.G_IteratorPattern.Iterator.BookIterator;
import DesignPatterns.behavioral.G_IteratorPattern.Iterator.Iterator;

import java.util.List;

public class Library implements Collection {

    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(this);
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
