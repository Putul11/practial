package com.putul.springboot.web.controller;

import com.putul.springboot.web.service.LoginService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final LoginService loginService;


    public StudentController(LoginService loginService) {
        this.loginService = loginService;
    }
}
