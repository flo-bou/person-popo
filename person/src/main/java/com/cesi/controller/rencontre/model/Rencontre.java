package com.cesi.controller.rencontre.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rencontre {
    private Integer id;
    private Integer nuGagnant;
    private Integer nuPerdant;
    private String lieuTournoi;
    private Integer annee;

    public Rencontre(@JsonProperty("NuméroGagnant") Integer nuGagnant,
                    @JsonProperty("NuméroPerdant") Integer nuPerdant,
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
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getGagnant() {
        return nuGagnant;
    }

    public void setGagnant(int nuGagnant) {
        this.nuGagnant = nuGagnant;
    }

    public Integer getPerdant() {
        return nuPerdant;
    }

    public void setPerdant(int nuPerdant) {
        this.nuPerdant = nuPerdant;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getLieuTournoi() {
        return lieuTournoi;
    }

    public void setLieuTournoi(String lieuTournoi) {
        this.lieuTournoi = lieuTournoi;
    }
}
