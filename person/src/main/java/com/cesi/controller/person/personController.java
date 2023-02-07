package com.cesi.controller.person;

import com.cesi.controller.person.model.person;
import com.cesi.services.personService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
public class personController {

    public static final String NOT_FOUND_MESSAGE = "Person not found";

    private static final Logger LOG = LoggerFactory.getLogger(personController.class);

//    private static final PersonMapper MAPPER = PersonMapper.INSTANCE;

    private final personService personService;

    @Autowired
    public personController(personService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<person> listPersons(@RequestParam(value = "id", required = false) String id,
                                    @RequestParam(value = "nom", required = false) String nom) {

        List<person> res = new ArrayList<person>();

        try {
            if (id == null &&  nom == null) {
                res = this.personService.getAllPersons();
            } else {
                res = this.personService.getPersonsFilter(id,nom);
            }

        } catch (final Exception e) {
            LOG.error("Pb du service /person: ", e);
        }

        return res;

    }

    @PostMapping("/persons")
    public person addPerson(@RequestBody person person) {

        person resp = null;


        try {
            resp = this.personService.addPerson(person);

        } catch (final Exception e) {
            LOG.error("Pb du service /person: ", e);
        }

        return resp;

    }

    @DeleteMapping("persons/{id}")
    public Boolean deletePersonRest(@PathVariable Integer id) {

        Boolean resp = null;

        try {
            resp = this.personService.deleteById(id);

        } catch (final Exception e) {
            LOG.error("Pb du service /person: ", e);
        }

        return resp;

    }

    @PutMapping("persons/{id}")
    public person updatePersonRest(@RequestBody person person, @PathVariable Integer id) {

        person resp = null;

        try {
            resp = this.personService.update(person,id);
        } catch (final Exception e) {
            LOG.error("Pb du service /person: ", e);
        }

        return resp;

    }

}

