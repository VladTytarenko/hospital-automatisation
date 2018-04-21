package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.DaoInteface;
import com.tytarenko.hospitalautomatisation.entities.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipeDao implements DaoInteface<Recipe> {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplated;

    @Override
    public List<Recipe> get(long patientId) {
        return null;//jdbcTemplated.queryForObject("SELECT * FROM recipe ");
    }

    @Override
    public void add(Recipe object) {

    }


}
