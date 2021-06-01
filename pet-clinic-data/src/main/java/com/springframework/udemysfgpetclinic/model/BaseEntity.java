package com.springframework.udemysfgpetclinic.model;

import java.io.Serializable;

/**
 * @author Khee Siang
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
