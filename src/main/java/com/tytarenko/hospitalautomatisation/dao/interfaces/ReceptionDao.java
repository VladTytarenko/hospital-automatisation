package com.tytarenko.hospitalautomatisation.dao.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Reception;

import java.util.List;

public interface ReceptionDao {

    List<Reception> getReceptionOfPatient(String passport);
    void addReception(Reception reception);
}
