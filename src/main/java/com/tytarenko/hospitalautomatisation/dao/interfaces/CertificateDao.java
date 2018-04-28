package com.tytarenko.hospitalautomatisation.dao.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Certificate;

import java.util.List;

public interface CertificateDao {

    List<Certificate> getCertificateOfDoctor(String passport);
    void addCertificate(Certificate certificate);

}
