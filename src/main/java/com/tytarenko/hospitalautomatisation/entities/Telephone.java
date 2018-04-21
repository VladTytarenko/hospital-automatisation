package com.tytarenko.hospitalautomatisation.entities;

public class Telephone<T> {

    private long telephone;
    private T user;

    public Telephone() {
    }

    public Telephone(long telephone, T user) {
        this.telephone = telephone;
        this.user = user;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public T getDoctor() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }
}
