package DesignPatterns.behavioral.G_IteratorPattern.Iterator;

import DesignPatterns.behavioral.G_IteratorPattern.Library.Book;
import DesignPatterns.behavioral.G_IteratorPattern.Library.Library;

import java.util.List;

public class BookIterator implements Iterator<Book>{
    Library library;
    int index = 0;
    public BookIterator(Library library) {
        this.library=library;
    }

    @Override
    public boolean hasNext() {
        return index < library.getBookList().size();
    }

    @Override
    public Book next() {
        Book book = library.getBookList().get(index);
        index++;
        return book;
    }
}
