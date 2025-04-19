package DesignPatterns.creational.C_BuilderPattern;

import java.util.ArrayList;

public class EngineeringStudent extends StudentBuilder{

    @Override
    public StudentBuilder subjects() {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("DBMS");
        subjects.add("Java");
        this.subjects = subjects;
        return this;
    }
}
