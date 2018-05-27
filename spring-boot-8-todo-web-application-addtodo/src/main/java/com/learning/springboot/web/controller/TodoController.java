package com.learning.springboot.web.controller;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learning.springboot.web.service.TodoService;

@Controller
@SessionAttributes("UserName")
public class TodoController {
         
         @Autowired
         TodoService service;
         
         @RequestMapping(value="/list-todos", method = RequestMethod.GET)
         public String showTodos(ModelMap model){
        	 
        	    /* Here you will not get any thing in model becuase of the fact that modal of 
        	     * LoginController is not in memory now. To your knowledge models are only valid 
        	     * for one request as soon as request is over models are deleted. 
        	     * It is stored in stack (like of method level variables).
        	     * 
        	     * This is the reason why we need SESSIONS*/
                 String name = (String) model.get("UserName");
                 model.put("todos", service.retrieveTodos(name));
                 return "list-todos";
         }
         
         
         @RequestMapping(value="/add-todo", method = RequestMethod.GET)
         public String showAddTodoPage(ModelMap model){
                 return "todo";
         }

         @RequestMapping(value="/add-todo", method = RequestMethod.POST)
         public String addTodo(ModelMap model, @RequestParam String description){
                 service.addTodo((String) model.get("UserName"), description, new Date(), false);
                 //here we have redirected to existing URL
                 return "redirect:/list-todos";
         }


}
