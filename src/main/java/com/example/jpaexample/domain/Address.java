package com.example.jpaexample.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Address {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
