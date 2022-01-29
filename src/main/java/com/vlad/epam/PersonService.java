package com.vlad.epam;

import java.util.List;
import java.util.Optional;

public class PersonService {
    public void printFullNamePerson(Person person) {
        if (person != null) {
            System.out.println(person.getSurname() + " " + person.getName());
        }
    }

    public Optional<Person> findPersonByName(String name) {
        Person person = findPersonByNameInDB(name);
        if (person!= null){
            return Optional.of(person);
        }else {
            return Optional.empty();
        }
    }


    /**
     * Database
     */
    private Person findPersonByNameInDB(String name) {
        List<Person> personList = List.of(
                new Person("Serg", "Ivanov"),
                new Person("Ivan", "Petrov"),
                new Person("Petr", "Sidorov"),
                new Person("John", "Bloch")
        );
        return personList.stream().filter(x -> x.getName().equals(name)).findFirst().orElse(null);
    }
}
