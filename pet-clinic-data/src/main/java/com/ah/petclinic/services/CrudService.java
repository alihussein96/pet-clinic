package com.ah.petclinic.services;

import java.util.Set;

public interface CrudService <T, ID> {
    Set<T> findAll();

    T finalById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
