package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.ReferalDao;
import com.tytarenko.hospitalautomatisation.entities.Referal;
import com.tytarenko.hospitalautomatisation.services.interfaces.ReferalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferalServiceImpl implements ReferalService {

    @Autowired
    private ReferalDao referalDao;

    @Override
    public void addReferal(Referal referal) {
        referalDao.addReferal(referal);
    }

    @Override
    public List<Referal> getReferalOfDoctor(String passport) {
        return referalDao.getReferalOfDoctor(passport);
    }

    @Override
    public List<Referal> getReferalOfPatient(String patient) {
        return referalDao.getReferalOfPatient(patient);
    }
}
