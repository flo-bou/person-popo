package com.cesi.services.rencontre;

import org.mapstruct.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

import com.cesi.dao.rencontre.RencontreDAO;

public class RencontreService {
    private final RencontreDAO rencontreDAO;

    @Autowired
    public RencontreService(@Qualifier("RencontreDAORest") final RencontreDAO rencontreDAO) {
        this.rencontreDAO = rencontreDAO;
    }

    public boolean deleteById(final Integer id) {
        return rencontreDAO.deleteRencontre(id);
    }
}


