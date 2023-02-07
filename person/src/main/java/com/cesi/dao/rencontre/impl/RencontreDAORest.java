package com.cesi.dao.rencontre.impl;

import java.util.Arrays;

import org.springframework.http.*;
import org.springframework.stereotype.Repository;

import com.cesi.controller.rencontre.model.Rencontre;
import com.cesi.dao.rencontre.RencontreDAO;
import com.cesi.dao.rencontre.model.RencontreDTO;

@Repository //veut dire qu'on est une dao 
public class RencontreDAORest implements RencontreDAO {

    public RencontreDAORest(){
    }

    @Override
    public Rencontre addRencontre(Rencontre rencontre) {
        ResponseEntity<Rencontre> response;

        String url = "https://8080-romainvisbec-springcesi-pww6n510xt2.ws-eu85.gitpod.io/rencontres";

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<Rencontre> entity = new HttpEntity<Rencontre>(rencontre, headers);

        return null;
    }



}
