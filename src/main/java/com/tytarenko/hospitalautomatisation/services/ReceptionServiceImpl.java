package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.ReceptionDao;
import com.tytarenko.hospitalautomatisation.entities.Reception;
import com.tytarenko.hospitalautomatisation.services.interfaces.ReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionServiceImpl implements ReceptionService {

    @Autowired
    private ReceptionDao receptionDao;

    @Override
    public Reception getReceptionById(long id) {
        return receptionDao.getReceptionById(id);
    }

    @Override
    public List<Reception> getReceptionOfPatient(String passport) {
        return receptionDao.getReceptionOfPatient(passport);
    }

    @Override
    public List<Reception> getReceptionOfDoctor(String passport) {
        return receptionDao.getReceptionOfDoctor(passport);
    }

    @Override
    public void addReception(Reception reception) {
        receptionDao.addReception(reception);
    }
}
