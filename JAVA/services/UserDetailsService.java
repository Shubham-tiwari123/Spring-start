package com.springpro.springmaven.services;

import com.springpro.springmaven.entity.UserDetails;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {
    
    private final List<UserDetails> data = Arrays.asList(new UserDetails(0, "shubham", "mumbai"),
                             new UserDetails(1, "abhi", "punessssssssssss"),
                             new UserDetails(2, "shivam", "banglore"));
    
    public List<UserDetails> returnData(){
        return data;
    }
    
    public UserDetails getUserDetail(String value){
        return data.stream().filter(d ->d.getName().equals(value)).findFirst().get();
    }
}
