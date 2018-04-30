package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.SpecializationDao;
import com.tytarenko.hospitalautomatisation.dao.mappers.SpecializationMapper;
import com.tytarenko.hospitalautomatisation.entities.Specialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SpecializationDaoImpl implements SpecializationDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Specialization> getAllSpecialization() {
        return jdbcTemplate.query("SELECT * FROM specialization",
                new SpecializationMapper());
    }
}
