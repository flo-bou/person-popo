package com.cesi.dao.person;

import com.cesi.controller.person.model.person;

import java.util.List;

public interface PersonDAO {

    boolean deletePerson(Integer id);

    person addPerson(person person);

    List<person> getAllPersons();

    List<person> getPersonsFilter(String id,String nom);

    person findById(Integer id);

    person update(person person);
}
