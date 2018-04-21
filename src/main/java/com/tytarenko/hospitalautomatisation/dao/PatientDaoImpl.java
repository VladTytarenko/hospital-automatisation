package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.PatientDao;
import com.tytarenko.hospitalautomatisation.dao.mappers.PatientMapper;
import com.tytarenko.hospitalautomatisation.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PatientDaoImpl implements PatientDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public Patient getPatientById(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM patient WHERE registration_number=:id",
                new MapSqlParameterSource().addValue("id", id),
                new PatientMapper());
    }

    @Override
    public List<Patient> getAllPatient() {
        return jdbcTemplate.query("SELECT * FROM patient", new PatientMapper());
    }

    @Override
    public void insetNewPatient(Patient patient) {
        jdbcTemplate.update("INSERT INTO patient (passport, surname, name, " +
                "patronymic, address, email, birthdate, registration_date, " +
                "invalidity, insurance_company, insurance_policy_number, patientcol) VALUES (:passport, :surname, :name, " +
                ":patronymic, :address, :email, :birthdate, :registration_date, " +
                ":invalidity, :insurance_company, :insurance_policy_number, :insurance_type)",
                new MapSqlParameterSource()
                        .addValue("passport", patient.getPassport())
                        .addValue("surname", patient.getSurname())
                        .addValue("name", patient.getName())
                        .addValue("patronymic", patient.getPatronymic())
                        .addValue("address", patient.getAddress())
                        .addValue("email", patient.getEmail())
                        .addValue("birthdate", patient.getBirthdate())
                        .addValue("registration_date", patient.getRegistrationDate())
                        .addValue("invalidity", patient.getInvalidity())
                        .addValue("insurance_company", patient.getInsuranceCompany())
                        .addValue("insurance_policy_number", patient.getInsuranceNumber())
                        .addValue("insurance_type", patient.getInsuranceType())
        );


    }

    @Override
    public void updatePatient(Patient patient) {

    }

    @Override
    public void deletePatientById(long id) {
        jdbcTemplate.update("DELETE FROM patient WHERE registration_number=:id",
                new MapSqlParameterSource().addValue("id", id));

    }
}
