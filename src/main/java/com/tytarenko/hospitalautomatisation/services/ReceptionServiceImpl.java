package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.ReceptionDao;
import com.tytarenko.hospitalautomatisation.entities.Reception;
import com.tytarenko.hospitalautomatisation.services.interfaces.ReceptionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReceptionServiceImpl implements ReceptionService {

    @Autowired
    private ReceptionDao receptionDao;

    @Override
    public List<Reception> getReceptionOfPatient(String passport) {
        return receptionDao.getReceptionOfPatient(passport);
    }

    @Override
    public void addReception(Reception reception) {
        receptionDao.addReception(reception);
    }
}
