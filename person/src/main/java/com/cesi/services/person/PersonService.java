package com.cesi.services.person;

import com.cesi.controller.person.model.Person;
import com.cesi.dao.person.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("personDaoBDD") final PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public boolean deleteById(final Integer id) {
        return personDAO.deletePerson(id);
    }

    public List<Person> getAllPersons() {
        return personDAO.getAllPersons();
    }

    public List<Person> getPersonsFilter(String id,String nom) {
        return personDAO.getPersonsFilter(id,nom);
    }

    public Person addPerson(Person person){
        return personDAO.addPerson(person);
    }

    public Person update(Person person,Integer id){
        if(this.personDAO.findById(id) != null){
            person.setId(id);
            return this.personDAO.update(person);
        }else{
            person.setId(id);
            return this.personDAO.addPerson(person);
        }
    }
}