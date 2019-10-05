package com.springpro.springmaven.controller;

import com.springpro.springmaven.entity.RegisterPerson;
import com.springpro.springmaven.entity.UserDetails;
import com.springpro.springmaven.services.LoginPersonService;
import com.springpro.springmaven.services.RegisterPersonService;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ContentController {
    
    private RegisterPerson obj=new RegisterPerson();
    
    @Autowired
    private RegisterPersonService registerPerson;
    /*@Autowired
    private LoginPersonService loginPerson;*/
    
    @RequestMapping("/getDetails")
    public UserDetails getDetails(){
        System.out.println("get");
        return registerPerson.getUserDetails();
    }
    
    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }
    
    @RequestMapping("/getAllUsers")
    public List<RegisterPerson> getAllRegisteredUsers() throws SQLException{
        List<RegisterPerson> details = registerPerson.getAllRegisteredUsers();
        return details;
    }
    
    @RequestMapping("/login")
    public ModelAndView login(){
        System.out.println("login");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login.jsp");
        return modelAndView;
    }
    
    /*@RequestMapping("/signIn")
    public ModelAndView registerPerson(RegisterPerson data){
        System.out.println("register");
        registerPerson.acceptValue(data);
        int code = obj.getProgramCode();
        if(code==200){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("/login.jsp");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error", obj.getErrorMsg());
        modelAndView.setViewName("/error.jsp");
        return modelAndView;
    }
    
    @RequestMapping("/welcome")
    public ModelAndView checkPerson(RegisterPerson data){
        System.out.println("check"+data.getEmailId()+" "+data.getPassword());
        loginPerson.checkPerson(data);
        int code = obj.getProgramCode();
        if(code==202){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("/welcome.jsp");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error", obj.getErrorMsg());
        modelAndView.setViewName("/error.jsp");
        return modelAndView;
    }*/
    
    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello world";
    }
    
}
