package com.putul.springboot.web.service;


import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String uid, String password){

        return  uid.equalsIgnoreCase("putul123")
                && password.equalsIgnoreCase("dummy");
    }
}
