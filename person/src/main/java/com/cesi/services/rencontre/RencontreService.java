package com.cesi.services.rencontre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesi.controller.rencontre.model.Rencontre;
import com.cesi.dao.rencontre.RencontreDAO;

@Service //dire qu'on est un service
public class RencontreService {
    private final RencontreDAO rencontreDAO;

    @Autowired
    public RencontreService (RencontreDAO rencontreDAO) {
        this.rencontreDAO = rencontreDAO;
    }

    public Rencontre addRencontre(Rencontre rencontre) {
        return rencontreDAO.addRencontre(rencontre);
    }
}


