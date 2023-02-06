package com.cesi.dao.person;

import com.cesi.dao.person.model.PersonDTO;

public class PersonDAO {
    boolean deletePerson(Integer id);

    PersonDTO addPerson(PersonDTO person);

    List<PersonDTO> getAllPersons();

}
