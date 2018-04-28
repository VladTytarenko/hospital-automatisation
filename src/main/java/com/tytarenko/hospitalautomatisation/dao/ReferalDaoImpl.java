package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.ReferalDao;
import com.tytarenko.hospitalautomatisation.dao.mappers.ReferalMapper;
import com.tytarenko.hospitalautomatisation.entities.Referal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

import static org.aspectj.weaver.patterns.TypeCategoryTypePattern.INNER;

public class ReferalDaoImpl implements ReferalDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;


    @Override
    public void addReferal(Referal referal) {
        jdbcTemplate.update("INSERT INTO referal (patient_id, doctor_passport_from, doctor_passport_to) VALUES (:patient_id, :doctor_from, doctor_to)",
                new MapSqlParameterSource().addValue("patient_id", referal.getPatient())
        .addValue("doctor_from", referal.getDoctorFrom())
        .addValue("doctor_to", referal.getDocotrTo()));
    }

    @Override
    public List<Referal> getReferalOfDoctor(String passport) {
        return jdbcTemplate.query("SELECT * FROM referal WHERE doctor_passport_to = :passport ",
                new MapSqlParameterSource().addValue("passport", passport),
                new ReferalMapper());
    }

    @Override
    public List<Referal> getReferalOfPatient(String patient) {
        return jdbcTemplate.query("SELECT * FROM referal WHERE patient_id = :passport ",
                new MapSqlParameterSource().addValue("passport", patient),
                new ReferalMapper());
    }
}
