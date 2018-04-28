package com.tytarenko.hospitalautomatisation.services.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Reception;

import java.util.List;

public interface ReceptionService {

    List<Reception> getReceptionOfPatient(String passport);
    void addReception(Reception reception);
}
