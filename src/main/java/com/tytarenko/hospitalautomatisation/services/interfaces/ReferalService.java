package com.tytarenko.hospitalautomatisation.services.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Referal;

import java.util.List;

public interface ReferalService {

    void addReferal(Referal referal);
    List<Referal> getReferalOfDoctor(String passport);
    List<Referal> getReferalOfPatient(String patient);

}
