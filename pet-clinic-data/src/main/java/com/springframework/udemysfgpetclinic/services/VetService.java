package com.springframework.udemysfgpetclinic.services;

import com.springframework.udemysfgpetclinic.model.Vet;

import java.util.Set;

/**
 * @author Khee Siang
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
