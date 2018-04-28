package com.tytarenko.hospitalautomatisation.dao.interfaces;

import com.tytarenko.hospitalautomatisation.entities.Telephone;

import java.util.List;

public interface TelephoneDao<T> {

    List<Telephone<T>> getTelephone(String passport);
    void addTelephone(Telephone<T> telephone);
    void update(Telephone<T> telephone, String passport, String telephoneOld);
    void delete(String telephone);

}