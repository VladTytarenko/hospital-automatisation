package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.TelephoneDao;
import com.tytarenko.hospitalautomatisation.entities.Patient;
import com.tytarenko.hospitalautomatisation.entities.Telephone;
import com.tytarenko.hospitalautomatisation.services.interfaces.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientTelephoneService implements TelephoneService<Patient> {

    @Autowired
    private TelephoneDao<Patient> patientTelephoneDao;

    @Override
    public List<Telephone<Patient>> getTelephone(String passport) {
        return patientTelephoneDao.getTelephone(passport);
    }

    @Override
    public void addTelephone(Telephone<Patient> telephone) {
        patientTelephoneDao.addTelephone(telephone);
    }

    @Override
    public void update(long telephone, long telephoneOld) {
        patientTelephoneDao.update(telephone, telephoneOld);
    }

    @Override
    public void delete(long telephone) {
        patientTelephoneDao.delete(telephone);
    }
}