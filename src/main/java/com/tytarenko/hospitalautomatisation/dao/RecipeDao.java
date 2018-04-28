package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.DaoInteface;
import com.tytarenko.hospitalautomatisation.dao.mappers.RecipeMapper;
import com.tytarenko.hospitalautomatisation.dao.mappers.RecommendationMapper;
import com.tytarenko.hospitalautomatisation.entities.Recipe;
import com.tytarenko.hospitalautomatisation.entities.Recommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipeDao implements DaoInteface<Recipe> {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;


    @Override
    public List<Recipe> get(String passport) {
        return jdbcTemplate.query("SELECT R.id, R.medicament, REC.patient_passport\n" +
                "FROM recipe AS R\n" +
                "     INNER JOIN\n" +
                "     (SELECT id FROM reception WHERE patient_passport = :passport) AS REC\n" +
                "     ON\n" +
                "     R.reception_id = REC.id",
                new MapSqlParameterSource("passport", passport),
                new RecipeMapper());
    }

    @Override
    public List<Recipe> getByReception(long id) {
        return jdbcTemplate.query("SELECT * FROM recipe WHERE reception_id = :id",
                new MapSqlParameterSource().addValue("id", id),
                new RecipeMapper());
    }

    @Override
    public void add(Recipe object) {
        jdbcTemplate.update("INSERT INTO recipe (medicament, reception_id) VALUES (:medicament, :reception_id)",
                new MapSqlParameterSource().addValue("medicament", object.getMedicament())
        .addValue("reception_id", object.getReception()));
    }
}
