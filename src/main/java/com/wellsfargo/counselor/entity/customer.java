package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;


public class customer {



    private Long id;


    private String name;

    public customer() {
    }

    public customer(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
