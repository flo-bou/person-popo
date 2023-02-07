package com.cesi.controller.rencontre.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rencontre {
    private Integer id;
    private Integer nuGagnant;
    private Integer nuPerdant;
    private String lieuTournoi;
    private Integer annee;

    public Rencontre(@JsonProperty("nuGagnant") Integer nuGagnant,
                    @JsonProperty("nuPerdant") Integer nuPerdant,
                    @JsonProperty("annee") Integer annee,
                    @JsonProperty("lieuTournoi") String lieuTournoi){
        this.nuGagnant = nuGagnant;
        this.nuPerdant = nuPerdant;
        this.annee = annee;
        this.lieuTournoi = lieuTournoi;
    }

    @Override
    public String toString() {
        return this.nuGagnant +" : "+this.nuPerdant + " / " + this.lieuTournoi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNuGagnant() {
        return nuGagnant;
    }

    public void setNuGagnant(Integer nuGagnant) {
        this.nuGagnant = nuGagnant;
    }

    public Integer getNuPerdant() {
        return nuPerdant;
    }

    public void setNuPerdant(Integer nuPerdant) {
        this.nuPerdant = nuPerdant;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getLieuTournoi() {
        return lieuTournoi;
    }

    public void setLieuTournoi(String lieuTournoi) {
        this.lieuTournoi = lieuTournoi;
    }
}
