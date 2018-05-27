package com.learning.springboot.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
         
         @RequestMapping("/hello-service")
         public String loginMessage(@RequestParam String name, ModelMap model){
        	 model.put("UserName", name);
                  return "hello";
         }
}
