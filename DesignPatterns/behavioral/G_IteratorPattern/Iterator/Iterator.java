package DesignPatterns.behavioral.G_IteratorPattern.Iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
