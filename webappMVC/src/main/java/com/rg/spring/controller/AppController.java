package com.rg.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
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
 
        List<User> users = service.findAllUsers();
        model.put("users", users);
        
        return "allusers";
    }
    /*
     * This method will provide the medium to add a new employee.
     */
    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String newUser(ModelMap model) {
        User user = new User();
        model.addAttribute("user",user);
        model.addAttribute("edit", false);
        return "registration";
    }
    
    /*
     * This method will be called on form submission, handling POST request for
     * saving employee in database. It also validates the user input
     */
    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveUser(@Valid User user, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "registration";
        }
 
        /*
         * Preferred way to achieve uniqueness of field [ssn] should be implementing custom @Unique annotation 
         * and applying it on field [ssn] of Model class [Employee].
         * 
         * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
         * framework as well while still using internationalized messages.
         * 
         */
      /*  if(!service.isEmployeeSsnUnique(employee.getId(), user.getSsn())){
            FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
            result.addError(ssnError);
            return "registration";
        }*/
         
        service.saveUser(user);
 
        model.addAttribute("success", "User " + user.getFname() + " registered successfully");
        return "success";
    }
    
    
    /*
     * This method will provide the medium to update an existing employee.
     */
    @RequestMapping(value = { "/edit-{id}-user" }, method = RequestMethod.GET)
    public String editUser(@PathVariable int id, ModelMap model) {
        User user = service.findByID(id);
        model.addAttribute("user", user);
        model.addAttribute("edit", true);
        return "registration";
    }
    
    /*
     * This method will be called on form submission, handling POST request for
     * updating employee in database. It also validates the user input
     */
    @RequestMapping(value = { "/edit-{id}-user" }, method = RequestMethod.POST)
    public String updateUser(@Valid User user, BindingResult result,
            ModelMap model, @PathVariable int id) {
 
        if (result.hasErrors()) {
            return "registration";
        }
 
   
 
        service.updateUser(user);
 
        model.addAttribute("success", "Employee " + user.getFname()  + " updated successfully");
        return "success";
    }
 
     
    /*
     * This method will delete an employee by it's SSN value.
     */
    @RequestMapping(value = { "/delete-{id}-user" }, method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable int id) {
        service.deleteUserByID(id);
        return "redirect:/list";
    }
 
   
}
