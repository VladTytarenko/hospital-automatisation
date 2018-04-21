package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.DaoInteface;
import com.tytarenko.hospitalautomatisation.entities.Recommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecommendationDao implements DaoInteface<Recommendation> {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Recommendation> get(long patientId) {
        return null;
    }

    @Override
    public void add(Recommendation object) {

    }
}
