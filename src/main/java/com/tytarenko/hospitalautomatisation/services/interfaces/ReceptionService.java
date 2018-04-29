package com.tytarenko.hospitalautomatisation.services.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Reception;

import java.util.List;

public interface ReceptionService {

    Reception getReceptionById(long id);
    List<Reception> getReceptionOfPatient(String passport);
    List<Reception> getReceptionOfDoctor(String passport);
    void addReception(Reception reception);

}
