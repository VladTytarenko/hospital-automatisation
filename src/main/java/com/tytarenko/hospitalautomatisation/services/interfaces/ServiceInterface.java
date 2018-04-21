package com.tytarenko.hospitalautomatisation.services.interfaces;

import java.util.List;

public interface ServiceInterface<T> {

    List<T> get(long id);
    void add(T object);
}
