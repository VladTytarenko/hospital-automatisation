package com.tytarenko.hospitalautomatisation.entities;

public class Referal {

    private long id;
    private String patient;
    private String doctorFrom;
    private String docotrTo;

    public Referal() {
    }

    public Referal(String patient, String doctorFrom, String docotrTo) {
        this.patient = patient;
        this.doctorFrom = doctorFrom;
        this.docotrTo = docotrTo;
    }

    public Referal(long id, String patient, String doctorFrom, String docotrTo) {
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

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDoctorFrom() {
        return doctorFrom;
    }

    public void setDoctorFrom(String doctorFrom) {
        this.doctorFrom = doctorFrom;
    }

    public String getDocotrTo() {
        return docotrTo;
    }

    public void setDocotrTo(String docotrTo) {
        this.docotrTo = docotrTo;
    }
}
