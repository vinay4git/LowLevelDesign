package LowLevelDesigns.groupHierarchy.model;

public class Person {
    String name;
    Group parentGroup;

    public Person(String name, Group parentGroup) {
        this.name = name;
        this.parentGroup = parentGroup;
    }

    public String getName() {
        return name;
    }

    public Group getParentGroup() {
        return parentGroup;
    }
}
