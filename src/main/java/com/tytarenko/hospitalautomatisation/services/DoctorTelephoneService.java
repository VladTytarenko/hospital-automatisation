package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.TelephoneDao;
import com.tytarenko.hospitalautomatisation.entities.Doctor;
import com.tytarenko.hospitalautomatisation.entities.Telephone;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DoctorTelephoneService implements TelephoneDao<Doctor> {

    @Autowired
    private TelephoneDao<Doctor> doctorTelephoneService;

    @Override
    public List<Telephone<Doctor>> getTelephone(String passport) {
        return doctorTelephoneService.getTelephone(passport);
    }

    @Override
    public void addTelephone(Telephone<Doctor> telephone) {
        doctorTelephoneService.addTelephone(telephone);
    }

    @Override
    public void update(Telephone<Doctor> telephone, String passport, String telephoneOld) {
        doctorTelephoneService.update(telephone, passport, telephoneOld);
    }

    @Override
    public void delete(String telephone) {
        doctorTelephoneService.delete(telephone);
    }
}