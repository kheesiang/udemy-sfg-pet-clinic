package com.springframework.udemysfgpetclinic.model;

/**
 * @author Khee Siang
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
