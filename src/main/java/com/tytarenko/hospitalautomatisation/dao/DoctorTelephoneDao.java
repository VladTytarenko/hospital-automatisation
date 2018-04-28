package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.TelephoneDao;
import com.tytarenko.hospitalautomatisation.dao.mappers.TelephoneMapper;
import com.tytarenko.hospitalautomatisation.entities.Doctor;
import com.tytarenko.hospitalautomatisation.entities.Telephone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class DoctorTelephoneDao implements TelephoneDao<Doctor> {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Telephone<Doctor>> getTelephone(String passport) {
        return jdbcTemplate.query("SELECT * FROM telephone_doctor WHERE passport =: passport",
                new MapSqlParameterSource().addValue("passport", passport),
                new TelephoneMapper<Doctor>());
    }

    @Override
    public void addTelephone(Telephone<Doctor> telephone) {
        jdbcTemplate.update("INSERT INTO telephone_doctor (telephone, passport) VALUE (:telephone, :passport)",
                new MapSqlParameterSource().addValue("telephone", telephone.getTelephone())
                        .addValue("passport", telephone.getDoctor()));
    }

    @Override
    public void update(Telephone<Doctor> telephone, String passport, String telephoneOld) {
        jdbcTemplate.update("UPDATE telephone_doctor SET telephone = :telephone," +
                "passport = :passport WHERE passport := passportId AND telephone = :telephoneOld",
                new MapSqlParameterSource().addValue("telephone", telephone.getTelephone())
        .addValue("passport", telephone.getDoctor())
        .addValue("passportId", passport).addValue("telephoneOld", telephoneOld));
    }

    @Override
    public void delete(String telephone) {
        jdbcTemplate.update("DELETE FROM doctor_telephone WHERE telephone = :telephone",
                new MapSqlParameterSource().addValue("telephone", telephone));
    }
}
