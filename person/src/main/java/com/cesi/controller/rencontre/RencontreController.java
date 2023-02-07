package com.cesi.controller.rencontre;

import com.cesi.controller.person.model.Person;
import com.cesi.services.RencontreService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


public class RencontreController {
    
    public static final String NOT_FOUND_MESSAGE = "Person not found";

    private static final Logger LOG = LoggerFactory.getLogger(RencontreController.class);

    private final RencontreService rencontreService;

    @Autowired
    public RencontreController(RencontreService rencontreService) {
        this.rencontreService = rencontreService;
    }

}
