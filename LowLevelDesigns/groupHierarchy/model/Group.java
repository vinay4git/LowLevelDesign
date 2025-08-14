package LowLevelDesigns.groupHierarchy.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Group {
    String groupName;
    List<Group> subGroups;
    List<Person> persons;
    @Getter
    Group parentGroup;

    public Group(String groupName, List<Group> subGroups, List<Person> persons) {
        this.groupName = groupName;
        this.subGroups = subGroups;
        this.persons = persons;
    }

    public Group(String groupName, Group parentGroup) {
        this.groupName = groupName;
        this.parentGroup = parentGroup;
        this.subGroups = new ArrayList<>();
        this.persons = new ArrayList<>();
    }


    public void addSubGroups(List<Group> subGroups) {
        this.subGroups.addAll(subGroups);
    }

    public void addPersons(List<Person> persons) {
        this.persons.addAll(persons);
    }

}
