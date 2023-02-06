package com.cesi.dao.person.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoBDD implements PersonDAO {
    private static final Logger LOG = LoggerFactory.getLogger(PersonDaoBDD.class);
    private static final String ID_FIELDS="id";
    private static final String NOM_FIELDS="nom";
    private static final String PRENOM_FIELDS="prenom";
    private static final String ANNEENAISSANCE_FIELDS="anneeNaissance";
    private static final String NATIONNALITE_FIELDS="nationnalite";
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDaoBDD(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    private final RowMapper<PersonDTO> rowMapper = (rs, rowNum) -> {
        final PersonDTO person = new PersonDTO();
        person.setId(rs.getInt(ID_FIELD));
        person.setNom(rs.getString(NOM_FIELD));
        person.setPrenom(rs.getString(PRENOM_FIELD));
        person.setAnneeNaissance(rs.getInt(ANNEENAISSANCE_FIELD));
        person.setNationalite(rs.getString(NATIONALITE_FIELD));
        return person;
    };

    public List<PersonDTO> getAllPersons(){
        List<PersonDTO> listPerson = null;
        listPerson = this.jdbcTemplate.query("select * from person", this.rowMapper);

        return listPerson;
    }

    @Override
    public List<Person> getAllPersons(){

    }
}