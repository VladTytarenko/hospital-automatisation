package com.tytarenko.hospitalautomatisation.entities;


public class Recipe {

    private long id;
    private Reception reception;
    private String medicament;

    public Recipe() {
    }

    public Recipe(long id, Reception reception, String medicament) {
        this.id = id;
        this.reception = reception;
        this.medicament = medicament;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Reception getReceptionId() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    public String getMedicament() {
        return medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

}
