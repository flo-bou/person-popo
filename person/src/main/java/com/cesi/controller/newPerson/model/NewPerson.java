package com.cesi.controller.newPerson.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewPerson {

    private Integer id;
    private String nom;
    private String prenom;
    private String nationalite;
    private Integer nbDefaite;
    private Integer nbVictoire;

    @JsonCreator
    public NewPerson(@JsonProperty("id") Integer id,
                  @JsonProperty("nom") String nom,
                  @JsonProperty("prenom") String prenom,
                  @JsonProperty("nationalite") String nationalite,
                  @JsonProperty("nbVictoire") Integer nbVictoire,
                  @JsonProperty("nbDefaite") Integer nbDefaite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.nbVictoire = nbVictoire;
        this.nbDefaite = nbDefaite;

    }

    // UGLY ! public void constructor and setters 4 mapstruct
    public NewPerson() {
    }

    public NewPerson(@JsonProperty("nom") String nom,
                  @JsonProperty("prenom") String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    @Override
    public String toString() {
        return this.id +" : "+this.nom + " / " + this.prenom;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public Integer getnbDefaite() {
        return nbDefaite;
    }

    public Integer getnbVictoire() {
        return nbVictoire;
    }

}
