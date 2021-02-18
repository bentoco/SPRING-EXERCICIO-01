package com.ayty.model;

import javax.persistence.Entity;

@Entity
public class Company extends User{
    private String socialName;
    private String fantasyName;
    private String registeredNumber;

    public Company() {}

    public Company(String username, String fullName, String phoneNumber, String email, String password, String socialName, String fantasyName, String registeredNumber) {
        super(username, fullName, phoneNumber, email, password);
        this.socialName = socialName;
        this.fantasyName = fantasyName;
        this.registeredNumber = registeredNumber;
    }
}
