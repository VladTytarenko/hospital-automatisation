package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.TelephoneDao;
import com.tytarenko.hospitalautomatisation.entities.Doctor;
import com.tytarenko.hospitalautomatisation.entities.Telephone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public void update(long telephone, long telephoneOld) {
        doctorTelephoneService.update(telephone, telephoneOld);
    }

    @Override
    public void delete(long telephone) {
        doctorTelephoneService.delete(telephone);
    }
}