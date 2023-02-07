package com.cesi.person;

import com.cesi.controller.person.model.person;
import com.cesi.dao.person.impl.PersonDaoBDD;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExecuteDao {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void init(){
        //PersonDaoBDD dao = new PersonDaoBDD(dataSource);
        //List<person> retour = dao.getAllPersons();
        
    }
}
