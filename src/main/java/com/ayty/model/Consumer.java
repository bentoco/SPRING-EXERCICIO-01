package com.ayty.model;

import javax.persistence.Entity;

@Entity
public class Consumer extends User {
    public Consumer(){

    }

    public Consumer(String username, String fullName, String phoneNumber, String email, String password) {
        super(username, fullName, phoneNumber, email, password);
    }
}
