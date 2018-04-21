package com.tytarenko.hospitalautomatisation.dao.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Patient;

import java.util.List;


public interface PatientDao {

    Patient getPatientById(long id);
    List<Patient> getAllPatient();
    void insetNewPatient(Patient patient);
    void updatePatient(Patient patient);
    void deletePatientById(long id);

}
