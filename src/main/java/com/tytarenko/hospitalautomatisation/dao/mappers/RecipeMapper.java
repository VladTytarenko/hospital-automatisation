package com.tytarenko.hospitalautomatisation.dao.mappers;

import com.tytarenko.hospitalautomatisation.entities.Recipe;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RecipeMapper implements RowMapper<Recipe> {

    @Override
    public Recipe mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Recipe(resultSet.getLong("id"),
                resultSet.getLong("reception_id"),
                resultSet.getString("medicament"));
    }

}
