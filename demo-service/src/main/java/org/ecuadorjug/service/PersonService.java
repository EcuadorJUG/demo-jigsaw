package org.ecuadorjug.service;

import org.ecuadorjug.model.person.Person;
import org.ecuadorjug.service.spi.PersonServiceProvider;

import java.io.Closeable;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by Kleber Ayala on 11/22/16.
 */
public abstract class PersonService {

    protected PersonService() {
    }

    public static Person getPerson(String id) {
        ServiceLoader<PersonServiceProvider> sl = ServiceLoader.load(PersonServiceProvider.class);
        Iterator<PersonServiceProvider> availableImpls = sl.iterator();
        if (!availableImpls.hasNext()) {
            throw new RuntimeException("No service providers found!");
        }
        PersonServiceProvider provider = availableImpls.next();
        System.out.println("Using Service Provider  Implementation :" + provider.getClass());
        return provider.getPerson(id);
    }

}
