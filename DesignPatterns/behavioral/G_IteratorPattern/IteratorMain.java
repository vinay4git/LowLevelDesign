package DesignPatterns.behavioral.G_IteratorPattern;

import DesignPatterns.behavioral.G_IteratorPattern.Iterator.Iterator;
import DesignPatterns.behavioral.G_IteratorPattern.Library.Book;
import DesignPatterns.behavioral.G_IteratorPattern.Library.Library;

import java.util.Arrays;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("fww", "dfew", "wvevwe"),
                new Book("df", "sdfsd", "sdfsdf"),
                new Book("sdf", "sdfsd", "sdfsdfsd")
        );

        Library library = new Library(bookList);

        Iterator<Book> iterator = library.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
