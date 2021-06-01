package com.springframework.udemysfgpetclinic.services;

import com.springframework.udemysfgpetclinic.model.Pet;

import java.util.Set;

/**
 * @author Khee Siang
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
