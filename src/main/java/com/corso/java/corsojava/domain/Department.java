package com.corso.java.corsojava.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    private String id;
    private String name;
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department() {}

    public Department(String name, String country) {

        this.name = name;
        this.country = country;
    }

    public Department(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }
}
