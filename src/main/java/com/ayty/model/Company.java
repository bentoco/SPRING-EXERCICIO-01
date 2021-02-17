package com.ayty.model;

public class Company extends User{
    private String socialName;
    private String fantasyName;
    private String registeredNumber;

    public Company(int id, String username, String fullName, String phoneNumber, String email, String password, String socialName, String fantasyName, String registeredNumber) {
        super(id, username, fullName, phoneNumber, email, password);
        this.socialName = socialName;
        this.fantasyName = fantasyName;
        this.registeredNumber = registeredNumber;
    }

    public Company() {
    }

}
