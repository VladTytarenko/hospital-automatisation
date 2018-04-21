package com.tytarenko.hospitalautomatisation.dao.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Doctor;

public interface DoctorDao {

    Doctor getByPassport(String passport);

}
