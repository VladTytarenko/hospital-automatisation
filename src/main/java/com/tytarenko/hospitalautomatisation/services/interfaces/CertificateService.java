package com.tytarenko.hospitalautomatisation.services.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Certificate;

import java.util.List;

public interface CertificateService {

    List<Certificate> getCertificateOfDoctor(String passport);
    void addCertificate(Certificate certificate);

}
