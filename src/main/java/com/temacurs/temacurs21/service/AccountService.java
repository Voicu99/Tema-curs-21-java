package com.temacurs.temacurs21.service;

import com.temacurs.temacurs21.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private EmailService emailService;

    public UserAccount createAccount(String firstName, String lastName, String email) {
        if (firstName == null || firstName.length() < 2 || lastName == null || lastName.length() < 2) {
            throw new IllegalArgumentException("First and last name must be at least 2 characters.");
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format.");
        }

        UserAccount newUser = new UserAccount(firstName, lastName, email);
        emailService.sendAccountConfirmation(newUser);
        return newUser;
    }
}


