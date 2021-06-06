package com.springframework.udemysfgpetclinic.services;

import com.springframework.udemysfgpetclinic.model.Owner;

/**
 * @author Khee Siang
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
