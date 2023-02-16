package com.cesi.controller.newPerson;

import com.cesi.controller.newPerson.model.NewPerson;
import com.cesi.services.newPerson.NewPersonService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
public class NewPersonController {

    public static final String NOT_FOUND_MESSAGE = "NewPerson not found";

    private static final Logger LOG = LoggerFactory.getLogger(NewPersonController.class);

    private final NewPersonService newPersonService;

    @Autowired
    public NewPersonController(NewPersonService newPersonService) {
        this.newPersonService = newPersonService;
    }

    @GetMapping("/newpersons")
    public List<NewPerson> listPersons(@RequestParam(value = "nom", required = false) String nom) {

        List<NewPerson> res = new ArrayList<NewPerson>();

        try {
            if (nom == null) {
                res = this.newPersonService.getAllPersons();
            }

        } catch (final Exception e) {
            LOG.error("Pb du service /newpersons: ", e);
        }

        return res;

    }
}

