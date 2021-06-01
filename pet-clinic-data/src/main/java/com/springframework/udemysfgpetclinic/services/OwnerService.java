package com.springframework.udemysfgpetclinic.services;

import com.springframework.udemysfgpetclinic.model.Owner;

import java.util.Set;

/**
 * @author Khee Siang
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
