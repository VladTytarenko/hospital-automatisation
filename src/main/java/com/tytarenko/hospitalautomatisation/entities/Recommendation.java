package com.tytarenko.hospitalautomatisation.entities;


public class Recommendation {

    private long id;
    private Reception reception;
    private String recommendation;

    public Recommendation() {
    }

    public Recommendation(Reception reception, String recommendation) {
        this.reception = reception;
        this.recommendation = recommendation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
}
