package com.tytarenko.hospitalautomatisation.services.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Doctor;

public interface DoctorService {

    Doctor getByPassport(String passport);

}
