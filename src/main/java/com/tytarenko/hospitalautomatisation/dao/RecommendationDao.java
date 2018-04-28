package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.DaoInteface;
import com.tytarenko.hospitalautomatisation.dao.mappers.RecommendationMapper;
import com.tytarenko.hospitalautomatisation.entities.Recommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecommendationDao implements DaoInteface<Recommendation> {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Recommendation> get(String passport) {
        return jdbcTemplate.query("SELECT R.id, R.recommendation, REC.patient_passport\n" +
                        "FROM recommendation AS R\n" +
                        "     INNER JOIN\n" +
                        "     (SELECT id FROM reception WHERE patient_passport = :passport) AS REC\n" +
                        "     ON\n" +
                        "     R.reception_id = REC.id",
                new MapSqlParameterSource("passport", passport),
                new RecommendationMapper());
    }

    @Override
    public List<Recommendation> getByReception(long id) {
        return jdbcTemplate.query("SELECT * FROM recommendation WHERE reception_id = :id",
                new MapSqlParameterSource().addValue("id", id),
                new RecommendationMapper());
    }

    @Override
    public void add(Recommendation object) {
        jdbcTemplate.update("INSERT INTO recommendation (recommendation, reception_id) VALUES (:recommendation, :reception_id)",
                new MapSqlParameterSource().addValue("recommendation", object.getRecommendation())
                        .addValue("reception_id", object.getReception()));
    }
}
