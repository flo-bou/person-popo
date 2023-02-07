package com.cesi.services;

import com.cesi.controller.person.model.person;
import com.cesi.dao.person.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personService {

    private final PersonDAO personDAO;

    @Autowired
    public personService(@Qualifier("personDaoBDD") final PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public boolean deleteById(final Integer id) {
        return personDAO.deletePerson(id);
    }

    public List<person> getAllPersons() {
        return personDAO.getAllPersons();
    }

    public List<person> getPersonsFilter(String id,String nom) {
        return personDAO.getPersonsFilter(id,nom);
    }

    public person addPerson(person person){
        return personDAO.addPerson(person);
    }

    public person update(person person,Integer id){
        if(this.personDAO.findById(id) != null){
            person.setId(id);
            return this.personDAO.update(person);
        }else{
            person.setId(id);
            return this.personDAO.addPerson(person);
        }
    }
}