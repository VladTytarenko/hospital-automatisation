package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.TelephoneDao;
import com.tytarenko.hospitalautomatisation.dao.mappers.PatientTelephoneMapper;
import com.tytarenko.hospitalautomatisation.entities.Patient;
import com.tytarenko.hospitalautomatisation.entities.Telephone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class PatientTelephoneDao implements TelephoneDao<Patient> {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Telephone<Patient>> getTelephone(String passport) {
        return jdbcTemplate.query("SELECT * FROM patient_telephone WHERE passport = :passport",
                                       new MapSqlParameterSource().addValue("passport", passport),
                                       new PatientTelephoneMapper());
    }

    @Override
    public void addTelephone(Telephone<Patient> telephone) {
        jdbcTemplate.update("INSERT INTO patient_telephone (telephone, passport) VALUES (:telephone," +
                ":passport)",
                new MapSqlParameterSource().addValue("telephone", telephone.getTelephone())
        .addValue("passport", telephone.getUser()));

    }

    @Override
    public void update(Telephone<Patient> telephone, String passport, String telephoneOld) {
        jdbcTemplate.update("UPDATE patient_telephone SET passport = :passport, telephone = :telephone" +
                "WHERE telephone = :telephoneOld",
                new MapSqlParameterSource().addValue("telephone", telephone.getTelephone())
        .addValue("passport", telephone.getUser())
        .addValue("telephoneOld", telephoneOld));

    }

    @Override
    public void delete(String telephone) {
        jdbcTemplate.update("DELETE FROM patient_telephone WHERE telephone = :telephone",
                new MapSqlParameterSource().addValue("telephone", telephone));
    }
}