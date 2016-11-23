package org.ecuadorjug.service.impl;

import org.ecuadorjug.model.person.Person;
import org.ecuadorjug.service.PersonService;
import org.ecuadorjug.service.spi.PersonServiceProvider;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kleber Ayala on 11/22/16.
 */
public class PersonServiceImpl extends PersonServiceProvider {

    private static final String ERR_PERSON_X_NOT_FOUND = "Person %s not found";
    private static Map<String, Person> personHashMap = new HashMap<>();

    static {

        Person person1 = new Person("171308LP", "Foo", "Bar");
        Person person2 = new Person("1571600SC", "Christin", "Pablo");
        Person person3 = new Person("170163LP", "Beatris", "Lauretta");
        Person person4 = new Person("1461103SC", "Pricilla", "Eldora");

        personHashMap.put("171308LP", person1);
        personHashMap.put("1571600SC", person2);
        personHashMap.put("170163LP", person3);
        personHashMap.put("1461103SC", person4);
    }


    @Override
    public Person getPerson(String id) {
        return personHashMap.get(id);
    }

    @Override
    public void addPerson(Person person) {
        personHashMap.put(person.getId(), person);
    }
}
