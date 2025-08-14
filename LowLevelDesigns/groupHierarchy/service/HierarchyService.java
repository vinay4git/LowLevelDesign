package LowLevelDesigns.groupHierarchy.service;

import LowLevelDesigns.groupHierarchy.model.Group;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class HierarchyService {

    PersonService personService;
    GroupService groupService;

    public HierarchyService(PersonService personService, GroupService groupService) {
        this.personService = personService;
        this.groupService = groupService;
    }

    public Optional<Group> getCommonGroup(List<String> person) {
        List<Queue<Group>> groupQueueList = person.stream().map(individual -> {
            return personService.getPerson(individual);
        }).map(individual -> {
            return groupService.parentGroupOrder(individual.getParentGroup());
        }).toList();


        Optional<Group> commonParentGroup = Optional.empty();
        while (true) {
            HashSet<Group> currentLevelSet = new HashSet<>();
            for (Queue<Group> hierarchyQueue : groupQueueList) {
                if (hierarchyQueue.isEmpty()){
                    currentLevelSet = new HashSet<>();
                    break;
                }
                currentLevelSet.add(hierarchyQueue.poll());
            }

            if (currentLevelSet.size() == 1) {
                commonParentGroup = Optional.of(currentLevelSet.stream().toList().get(0));
            } else {
                break;
            }
        }
        return commonParentGroup;
    }
}
