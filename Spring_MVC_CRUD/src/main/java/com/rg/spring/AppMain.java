package com.rg.spring;


import java.math.BigDecimal;
import java.util.List;
 
import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
 
import com.rg.spring.configuration.AppConfig;
import com.rg.spring.model.User;
import com.rg.spring.service.UserService;
 
public class AppMain {
 
    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
        UserService service = (UserService) context.getBean("UserService");
 
        /*
         * Create User1
         */
        User User1 = new User();
        User1.setFname("Rakesh");
        User1.setLname("Gauswami");
        User1.setAge(29);
        User1.setEmailID("goswamirakeshgiri@gmail.com");
        User1.setCellno("9158407741");
 
        service.saveUser(User1);
 
        /*
         * Get all Users list from database
         */
        List<User> Users = service.findAllUsers();
        for (User user : Users) {
            System.out.println(user);
        }
 
        /*
         * delete an User
         */
        service.deleteUserByID(3);
        
        /*
         * update an User
         */
 
        User User = service.findByID(1);
        User.setEmailID("newID");
        service.updateUser(User);
 
       
        context.close();
    }
}