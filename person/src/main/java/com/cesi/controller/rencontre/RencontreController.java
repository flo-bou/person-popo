package com.cesi.controller.rencontre;

import com.cesi.controller.rencontre.model.Rencontre;
import com.cesi.services.rencontre.RencontreService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class RencontreController {
    
    public static final String NOT_FOUND_MESSAGE = "Rencontre not found";

    private final RencontreService rencontreService;

    @Autowired
    public RencontreController(RencontreService rencontreService) {
        this.rencontreService = rencontreService;
    }

    @PostMapping("/rencontres")
    public Rencontre tartempion(@RequestBody Rencontre rencontre){
        Rencontre blabla = rencontreService.addRencontre(rencontre);
        return blabla;
    }

}
