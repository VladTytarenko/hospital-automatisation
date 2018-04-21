package com.tytarenko.hospitalautomatisation.entities;

import java.sql.Date;

public class Registration {

    private long id;
    private Doctor doctor;
    private Patient patient;
    private Date date;

    public Registration() {
    }

    public Registration(Doctor doctor, Patient patient, Date date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Registration(long id, Doctor doctor, Patient patient, Date date) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
