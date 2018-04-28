package com.tytarenko.hospitalautomatisation.services;

import com.tytarenko.hospitalautomatisation.dao.interfaces.CertificateDao;
import com.tytarenko.hospitalautomatisation.entities.Certificate;
import com.tytarenko.hospitalautomatisation.services.interfaces.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CertificateServiceImpl implements CertificateService {

    @Autowired
    private CertificateDao certificateDao;

    @Override
    public List<Certificate> getCertificateOfDoctor(String passport) {
        return certificateDao.getCertificateOfDoctor(passport);
    }

    @Override
    public void addCertificate(Certificate certificate) {
        certificateDao.addCertificate(certificate);
    }
}
