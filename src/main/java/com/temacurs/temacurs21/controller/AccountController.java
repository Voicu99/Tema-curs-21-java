package com.temacurs.temacurs21.controller;

import com.temacurs.temacurs21.model.UserAccount;
import com.temacurs.temacurs21.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/create")
    public UserAccount createAccount(@RequestParam String firstName,
                                     @RequestParam String lastName,
                                     @RequestParam String email) {
        return accountService.createAccount(firstName, lastName, email);
    }

    @GetMapping("/{id}")
    public String getUserAccount(@PathVariable String id) {
        // Mock retrieval - this would ideally fetch from a database
        return "User details: \nID: " + id + "\nName: Mock User";
    }
}


