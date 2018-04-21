package com.tytarenko.hospitalautomatisation.entities;

public class Referal {

    private long id;
    private Patient patient;
    private Doctor doctorFrom;
    private Doctor docotrTo;

    public Referal() {
    }

    public Referal(Patient patient, Doctor doctorFrom, Doctor docotrTo) {
        this.patient = patient;
        this.doctorFrom = doctorFrom;
        this.docotrTo = docotrTo;
    }

    public Referal(long id, Patient patient, Doctor doctorFrom, Doctor docotrTo) {
        this.id = id;
        this.patient = patient;
        this.doctorFrom = doctorFrom;
        this.docotrTo = docotrTo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctorFrom() {
        return doctorFrom;
    }

    public void setDoctorFrom(Doctor doctorFrom) {
        this.doctorFrom = doctorFrom;
    }

    public Doctor getDocotrTo() {
        return docotrTo;
    }

    public void setDocotrTo(Doctor docotrTo) {
        this.docotrTo = docotrTo;
    }
}
