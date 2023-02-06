package com.cesi.person;

import com.cesi.dao.person.impl.PersonDaoBDD;

@Component
public class ExecuteDao {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void init(){
        PersonDaoBDD dao = new PersonDaoBDD(dataSource);
        List<PersonDTO> retour = dao.getAllPersons();
        retour.size();
        
    }
}
