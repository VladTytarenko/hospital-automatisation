package com.tytarenko.hospitalautomatisation.services.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Doctor;

import java.util.List;

public interface DoctorService {

    List<Doctor> getAllDoctors();
    List<Doctor> getBySpecialization(long id);
    List<Doctor> getFamilyDoctors();
    Doctor getByPassport(String passport);
    void addDoctor(Doctor doctor);
    void updateDoctor(Doctor doctor, String passport);
    void deleteDoctorByPassport(String passport);

}
