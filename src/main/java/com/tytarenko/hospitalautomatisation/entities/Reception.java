package com.tytarenko.hospitalautomatisation.entities;

import java.util.Currency;


public class Reception {

    private long id;
    private Registration registration;
    private Currency price;

    public Reception() {
    }

    public Reception(Registration registration, Currency price) {
        this.id = id;
        this.registration = registration;
        this.price = price;
    }

    public Reception(long id, Registration registration, Currency price) {
        this.id = id;
        this.registration = registration;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }
}
