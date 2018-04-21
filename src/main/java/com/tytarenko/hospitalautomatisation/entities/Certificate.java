package com.tytarenko.hospitalautomatisation.entities;

public class Certificate {

    private long certificateNumber;
    private String certificatName;
    private Doctor doctor;

    public Certificate() {
    }

    public Certificate(long certificateNumber, String certificatName, Doctor doctor) {
        this.certificateNumber = certificateNumber;
        this.certificatName = certificatName;
        this.doctor = doctor;
    }

    public long getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(long certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getCertificatName() {
        return certificatName;
    }

    public void setCertificatName(String certificatName) {
        this.certificatName = certificatName;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
