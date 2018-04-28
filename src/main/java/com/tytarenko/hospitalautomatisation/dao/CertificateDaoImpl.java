package com.tytarenko.hospitalautomatisation.dao;

import com.tytarenko.hospitalautomatisation.dao.interfaces.CertificateDao;
import com.tytarenko.hospitalautomatisation.dao.mappers.CertificateMapper;
import com.tytarenko.hospitalautomatisation.entities.Certificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class CertificateDaoImpl implements CertificateDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Certificate> getCertificateOfDoctor(String passport) {
        return jdbcTemplate.query("SELECT * FROM certificate WHERE passport := passport",
                new MapSqlParameterSource().addValue("passport", passport),
                new CertificateMapper());
    }

    @Override
    public void addCertificate(Certificate certificate) {
        jdbcTemplate.update("INSERT INTO certificate (name, passport) " +
                "VALUES (:name, :passport)",
                new MapSqlParameterSource().addValue("name", certificate.getCertificatName())
        .addValue("passport", certificate.getDoctor()));
    }
}
