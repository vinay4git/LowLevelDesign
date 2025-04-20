package DesignPatterns.behavioral.G_IteratorPattern.Library;

public class Book {
    String name;
    String id;
    String topic;

    public Book(String name, String id, String topic) {
        this.name = name;
        this.id = id;
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
