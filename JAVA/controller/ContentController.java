package com.springpro.springmaven.controller;

import com.springpro.springmaven.dao.UserDetails;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {
    
    @RequestMapping("/index")
    public String index(){
        return "Welcome to home pages sjl;lmfgh";
    }
    
    //returning hard JSON value
    @RequestMapping("/details")
    public List<UserDetails> details(){
        return Arrays.asList(new UserDetails(0, "shubham", "mumbai"),
                             new UserDetails(1, "abhi", "pune"));
    }
    
}
