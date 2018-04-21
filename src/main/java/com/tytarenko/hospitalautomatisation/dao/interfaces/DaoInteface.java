package com.tytarenko.hospitalautomatisation.dao.interfaces;


import java.util.List;

public interface DaoInteface<T> {

    List<T> get(long patientId);
    void add(T object);

}
