package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.SpecializationDao;
import com.tytarenko.hospitalautomatisation.entities.Specialization;
import com.tytarenko.hospitalautomatisation.services.interfaces.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationServiceImpl implements SpecializationService {

    @Autowired
    private SpecializationDao specializationDao;

    @Override
    public List<Specialization> getAllSpecialization() {
        return specializationDao.getAllSpecialization();
    }
}
