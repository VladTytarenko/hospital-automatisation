package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.DoctorDao;
import com.tytarenko.hospitalautomatisation.entities.Doctor;
import com.tytarenko.hospitalautomatisation.services.interfaces.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorDao doctorDao;

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorDao.getAllDoctors();
    }

    @Override
    public Doctor getByPassport(String passport) {
        return doctorDao.getByPassport(passport);
    }

    @Override
    public void addDoctor(Doctor doctor) {
        doctorDao.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor, String passport) {
        doctorDao.updateDoctor(doctor, passport);
    }

    @Override
    public void deleteDoctorByPassport(String passport) {
        doctorDao.deleteDoctorByPassport(passport);
    }
}
