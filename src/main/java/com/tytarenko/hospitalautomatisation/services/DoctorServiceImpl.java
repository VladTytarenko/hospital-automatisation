package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.DoctorDao;
import com.tytarenko.hospitalautomatisation.entities.Doctor;
import com.tytarenko.hospitalautomatisation.services.interfaces.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorDao doctorDao;


    @Override
    public Doctor getByPassport(String passport) {
        return doctorDao.getByPassport(passport);
    }
}
