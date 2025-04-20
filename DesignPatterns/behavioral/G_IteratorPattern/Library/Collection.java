package DesignPatterns.behavioral.G_IteratorPattern.Library;

import DesignPatterns.behavioral.G_IteratorPattern.Iterator.Iterator;

public interface Collection {
    Iterator<?> iterator();
}
