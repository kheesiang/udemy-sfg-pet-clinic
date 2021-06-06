package com.springframework.udemysfgpetclinic.services.map;

import com.springframework.udemysfgpetclinic.model.Vet;
import com.springframework.udemysfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * @author Khee Siang
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}