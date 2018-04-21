package com.tytarenko.hospitalautomatisation.services.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Patient;

import java.util.List;


public interface PatientService {

    Patient getPatientById(long id);
    List<Patient> getAllPatient();
    void insetNewPatient(Patient patient);
    void updatePatient(Patient patient);
    void deletePatientById(long id);

}
