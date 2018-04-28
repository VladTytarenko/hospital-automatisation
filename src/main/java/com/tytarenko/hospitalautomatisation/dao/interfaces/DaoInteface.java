package com.tytarenko.hospitalautomatisation.dao.interfaces;


import java.util.List;

public interface DaoInteface<T> {

    List<T> get(String passport);
    List<T> getByReception(long id);
    void add(T object);

}
