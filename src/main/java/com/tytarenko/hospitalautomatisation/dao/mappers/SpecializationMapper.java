package com.tytarenko.hospitalautomatisation.dao.mappers;

import com.tytarenko.hospitalautomatisation.entities.Specialization;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpecializationMapper implements RowMapper<Specialization> {
    @Override
    public Specialization mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Specialization(resultSet.getInt("id"),
                                  resultSet.getString("specialization"));
    }
}
