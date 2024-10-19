package com.temacurs.temacurs21.service;

import com.temacurs.temacurs21.model.UserAccount;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendAccountConfirmation(UserAccount userAccount) {
        String emailContent = "Hello " + userAccount.getFirstName() +
                ",\nYour account has been successfully created! You can check your account details here: http://localhost:8080/user/" + userAccount.getId();

        // Simulate sending an email
        System.out.println("Sending email to: " + userAccount.getEmail());
        System.out.println("Email content: " + emailContent);
    }
}




