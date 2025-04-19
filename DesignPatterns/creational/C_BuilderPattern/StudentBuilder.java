package DesignPatterns.creational.C_BuilderPattern;

import java.util.List;

public abstract class StudentBuilder {
    String name;
    String id;
    String department;
    double grades;
    int age;
    List<String> subjects;

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder id(String id) {
        this.id = id;
        return this;
    }

    public StudentBuilder department(String department){
        this.department = department;
        return this;
    }

    public StudentBuilder grades(double grades) {
        this.grades = grades;
        return this;
    }

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    public abstract StudentBuilder subjects();

    public Student build() {
        return new Student(this);
    }
}
