package org.ecuadorjug.client;

import org.ecuadorjug.model.person.Person;
import org.ecuadorjug.service.PersonService;

/**
 * Created by Kleber Ayala on 11/22/16.
 */
public class DemoClient {
    public static void main(String... args) {

        Person person = PersonService.getPerson("171308LP");

        System.out.println("------------>");
        System.out.println("Executing services of PersonService getFirstName, getLastName");
        System.out.println(person.getFirstName().concat(" ").concat(person.getLastName()));
        System.out.println("------------>");

    }
}
