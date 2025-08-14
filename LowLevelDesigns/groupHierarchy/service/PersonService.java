package LowLevelDesigns.groupHierarchy.service;

import LowLevelDesigns.groupHierarchy.model.Group;
import LowLevelDesigns.groupHierarchy.model.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonService {
    Map<String, Person> personMap;

    public PersonService() {
        personMap = new HashMap<>();
    }

    public Person addNewPerson(String personName, Group parentGroup) {
        Person person = personMap.getOrDefault(personName, new Person(personName, parentGroup));
        personMap.put(personName, person);
        return person;
    }

    public Person getPerson(String personName) {
        return personMap.get(personName);
    }
}
