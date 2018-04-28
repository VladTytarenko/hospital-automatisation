package com.tytarenko.hospitalautomatisation.dao.mappers;


import com.tytarenko.hospitalautomatisation.entities.Doctor;
import com.tytarenko.hospitalautomatisation.entities.Telephone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorTelephoneMapper implements RowMapper<Telephone<Doctor>> {

    @Override
    public Telephone<Doctor> mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Telephone<Doctor>(resultSet.getLong("telephone"),
                resultSet.getString("passport"));
    }

}
