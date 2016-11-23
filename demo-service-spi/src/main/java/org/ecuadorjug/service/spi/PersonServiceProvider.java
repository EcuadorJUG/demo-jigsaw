package org.ecuadorjug.service.spi;

import org.ecuadorjug.model.person.Person;

/**
 * Created by Kleber Ayala on 11/22/16.
 */
public abstract class PersonServiceProvider {

    public abstract Person getPerson(String id);

    public abstract void addPerson(Person person);


}
