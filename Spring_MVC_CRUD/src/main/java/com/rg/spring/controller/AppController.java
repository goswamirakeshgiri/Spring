package com.rg.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rg.spring.model.User;
import com.rg.spring.service.UserService;
 
@Controller
@RequestMapping("/")
public class AppController {
 
    @Autowired
    UserService service;
     
    @Autowired
    MessageSource messageSource;
 
    /*
     * This method will list all existing Users.
     */
    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listUsers(ModelMap model) {
 
        List<User> Users = service.findAllUsers();
        model.addAttribute("Users", Users);
        return "allUsers";
    }
 
   
}
