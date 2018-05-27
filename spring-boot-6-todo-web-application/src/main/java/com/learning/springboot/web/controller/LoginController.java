package com.learning.springboot.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.springboot.web.service.LoginService;

@Controller
public class LoginController {
	
	
	@Autowired
    private LoginService service;
         
         @RequestMapping(value = "/login", method = RequestMethod.GET)
         public String showLoginPage() {
             return "login";
         }


         @RequestMapping(value = "/login", method = RequestMethod.POST)
         public String handleLogin(ModelMap model, @RequestParam String username,   @RequestParam String password) {

             if (service.validateUser(username, password)) {
                 model.put("UserName", username);
                 return "welcome";
             } else {
                 model.put("errorMessage", "Invalid Credentials!!");
                 return "login";
             }
         }


}
