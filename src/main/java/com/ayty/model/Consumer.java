package com.ayty.model;

public class Consumer extends User {
    public Consumer(int id, String username, String fullName, String phoneNumber, String email, String password) {
        super(id, username, fullName, phoneNumber, email, password);
    }

    public Consumer(){

    }

    @Override
    public String toString() {
        return "Consumer{ username: "+ getUsername() + " }";
    }
}
