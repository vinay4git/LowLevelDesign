package DesignPatterns.creational.C_BuilderPattern;

public class StudentManger {
    StudentBuilder studentBuilder;

    public StudentManger(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        return studentBuilder.id("3432").name("32423").subjects().build();
    }
}
