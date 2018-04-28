package com.tytarenko.hospitalautomatisation.services.interfaces;


import java.util.List;

public interface ServiceInteface<T> {

    List<T> get(String passport);
    List<T> getByReception(long id);
    void add(T object);

}
