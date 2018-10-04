package com.stemizer.cms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Customer extends BaseEntity {

    @Column(length = 55)
    private String name;
    private String surname;
    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
