package DesignPatterns.creational.C_BuilderPattern;

import java.util.List;

public class Student {
    String name;
    String id;
    String department;
    double grades;
    int age;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.id = studentBuilder.id;
        this.department = studentBuilder.department;
        this.grades = studentBuilder.grades;
        this.age = studentBuilder.age;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", grades=" + grades +
                ", age=" + age +
                ", subjects=" + subjects +
                '}';
    }
}
