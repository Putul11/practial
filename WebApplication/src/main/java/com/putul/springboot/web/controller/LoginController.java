package com.putul.springboot.web.controller;

import com.putul.springboot.web.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.ResponseBody;

// /Login => "My Controller"
@Controller
@SessionAttributes("name")
public class LoginController {


	private final LoginService service;

	public LoginController(LoginService service) {
		this.service = service;
	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		return "login";
	}

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
		boolean isValidUser = service.validateUser(name, password);

		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}

		model.put("name", name);
		model.put("password", password);

		return "welcome";
	}
}
