package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.PatientDao;
import com.tytarenko.hospitalautomatisation.entities.Patient;
import com.tytarenko.hospitalautomatisation.services.interfaces.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao;

    @Override
    public Patient getPatientById(long id) {
        return patientDao.getPatientById(id);
    }

    @Override
    public List<Patient> getAllPatient() {
        return patientDao.getAllPatient();
    }

    @Override
    public void insetNewPatient(Patient patient) {
        patientDao.insetNewPatient(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientDao.updatePatient(patient);
    }

    @Override
    public void deletePatientById(long id) {
        patientDao.deletePatientById(id);
    }
}
