package DesignPatterns.creational.C_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudent extends StudentBuilder{

    @Override
    public StudentBuilder subjects() {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Psychology");
        subjects.add("Management");
        this.subjects = subjects;
        return this;
    }
}
