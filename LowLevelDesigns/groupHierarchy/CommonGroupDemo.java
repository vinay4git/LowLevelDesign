package LowLevelDesigns.groupHierarchy;

import LowLevelDesigns.groupHierarchy.model.Group;
import LowLevelDesigns.groupHierarchy.service.GroupService;
import LowLevelDesigns.groupHierarchy.service.HierarchyService;
import LowLevelDesigns.groupHierarchy.service.PersonService;

import java.util.ArrayList;
import java.util.List;

public class CommonGroupDemo {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        GroupService groupService = new GroupService(personService);
        HierarchyService hierarchyService = new HierarchyService(personService, groupService);

        groupService.addGroup("Company", List.of("HR","Engg"),new ArrayList<>());
        groupService.addGroup("Engg", List.of("BE","FE"),new ArrayList<>());
        groupService.addGroup("HR", new ArrayList<>(), List.of("Mona", "Springs"));
        groupService.addGroup("BE", new ArrayList<>(), List.of("Alice", "Bob"));
        groupService.addGroup("FE", new ArrayList<>(), List.of("Lisa", "Marley"));

        hierarchyService.getCommonGroup(List.of("Mona", "Lisa")).map(Group::getGroupName).ifPresentOrElse(System.out::println, () -> System.out.println("No Common group Found"));
        hierarchyService.getCommonGroup(List.of("Lisa", "Alice")).map(Group::getGroupName).ifPresentOrElse(System.out::println, () -> System.out.println("No Common group Found"));


    }
}
