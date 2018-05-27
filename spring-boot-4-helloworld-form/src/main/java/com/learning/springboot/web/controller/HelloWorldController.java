package com.learning.springboot.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
         
         @RequestMapping(value = "/hello-service", method = RequestMethod.GET)
         public String showLoginPage() {
             return "hello";
         }

         @RequestMapping(value = "/hello-service", method = RequestMethod.POST)
         public String handleLogin(ModelMap model, @RequestParam String username) {
        	 model.put("UserName", username);
             return "welcome";
         }

}
