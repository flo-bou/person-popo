package com.cesi.services.newPerson;

import com.cesi.controller.newPerson.model.NewPerson;
import com.cesi.controller.person.model.Person;
import com.cesi.controller.rencontre.model.Rencontre;
import com.cesi.dao.person.PersonDAO;
import com.cesi.dao.rencontre.RencontreDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewPersonService {

    private final RencontreDAO rencontreDAO;

    private final PersonDAO personDAO;

    @Autowired
    public NewPersonService(@Qualifier("personDaoBDD") final PersonDAO personDAO, final RencontreDAO rencontreDAO) {
        this.personDAO = personDAO;
        this.rencontreDAO = rencontreDAO;
    }

    public List<NewPerson> getAllPersons() {
        List<Person> persons = personDAO.getAllPersons();
        for (Person person : persons){
            
        }

        /*List<Rencontre> rencontres = rencontreDAO.getAllRencontres();
        for (Person person : persons){
            int nbVictoire = 0 ;
            int nbDefaite = 0;
            for (Rencontre rencontre :  rencontres){
                if(rencontre.getNuGagnant().equals(person.getId())){nbVictoire++;}
                if(rencontre.getNuPerdant().equals(person.getId())){nbDefaite++;}
            }

        }*/


        return null;
    }

/*  public List<NewPerson> getPersonsFilter(String nom) {
        return personDAO.getPersonsFilter(nom);
    }
*/
}