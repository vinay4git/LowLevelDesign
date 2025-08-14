package LowLevelDesigns.groupHierarchy.service;

import LowLevelDesigns.groupHierarchy.model.Group;
import LowLevelDesigns.groupHierarchy.model.Person;

import java.util.*;

public class GroupService {
    Map<String, Group> groupMap;
    PersonService personService;

    public GroupService(PersonService personService) {
        this.groupMap = new HashMap<>();
        this.personService = personService;
    }

    public void addGroup(String groupName, List<String> subGroups, List<String> people) {

        Group parentGroup = groupMap.getOrDefault(groupName, new Group(groupName, null));
        groupMap.put(groupName, parentGroup);

        List<Group> subGroupList = subGroups.stream().map(subGroup -> {
            return groupMap.getOrDefault(subGroup, new Group(subGroup,parentGroup));
        }).toList();

        List<Person> peopleList = people.stream().map(personName -> {
            return personService.addNewPerson(personName, parentGroup);
        }).toList();

        parentGroup.addSubGroups(subGroupList);
        parentGroup.addPersons(peopleList);

        subGroupList.stream().forEach(group -> groupMap.putIfAbsent(group.getGroupName(), group));
    }
    public Queue<Group> parentGroupOrder(Group group) {
        if (group.getParentGroup() == null) {
            Queue<Group> parentGroupQueue = new LinkedList<>();
            parentGroupQueue.offer(group);
            return parentGroupQueue;
        }

        Queue<Group> parentGroupQueue = parentGroupOrder(group.getParentGroup());
        parentGroupQueue.offer(group);
        return parentGroupQueue;
    }
}
