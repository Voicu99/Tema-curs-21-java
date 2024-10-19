package com.temacurs.temacurs21.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserAccount {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime createdAt;

    public UserAccount(String firstName, String lastName, String email) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = LocalDateTime.now();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}



