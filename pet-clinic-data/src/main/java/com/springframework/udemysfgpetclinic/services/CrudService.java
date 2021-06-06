package com.springframework.udemysfgpetclinic.services;

import java.util.Set;

/**
 * @author Khee Siang
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
