package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.DoctorDao;
import com.tytarenko.hospitalautomatisation.dao.mappers.DoctorMapper;
import com.tytarenko.hospitalautomatisation.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDaoImpl implements DoctorDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public Doctor getByPassport(String passport) {
        jdbcTemplate.queryForObject("SELECT * FROM doctor WHERE passport = :passport",
                new MapSqlParameterSource().addValue("passport", passport),
                new DoctorMapper());
        return null;
    }
}
