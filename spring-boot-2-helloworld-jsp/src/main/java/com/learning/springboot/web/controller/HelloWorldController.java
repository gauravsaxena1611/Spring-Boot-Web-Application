package com.learning.springboot.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
         
         @RequestMapping("/hello-service")
         public String loginMessage(){
                  return "hello";
         }
}
