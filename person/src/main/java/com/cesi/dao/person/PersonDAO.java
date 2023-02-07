package com.cesi.dao.person;

import com.cesi.controller.person.model.Person;

import java.util.List;

public interface PersonDAO {

    boolean deletePerson(Integer id);

    Person addPerson(Person person);

    List<Person> getAllPersons();

    List<Person> getPersonsFilter(String id,String nom);

    Person findById(Integer id);

    Person update(Person person);
}
