package com.springpro.springmaven.services;

import com.springpro.springmaven.dao.RegisterPersonDao;
import com.springpro.springmaven.entity.RegisterPerson;
import com.springpro.springmaven.entity.UserDetails;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RegisterPersonService{
    
    RegisterPersonDao dao;
    public RegisterPersonService() {
        dao = new RegisterPersonDao();
    }
    
    public void acceptValue(RegisterPerson details){
        if(details.getEmailId()==null||details.getPassword()==null){
            details.setProgramCode(404);
            details.setErrorMsg("Invalid inputs");
        }
        else
            dao.saveData(details);
    }
    
    public UserDetails getUserDetails(){
        return new UserDetails(10, "Shubham", "mumbai");
    }
    
    public List<RegisterPerson> getAllRegisteredUsers() throws SQLException{
        List<RegisterPerson> details = new ArrayList<>();
        System.out.println("alll");
        ResultSet rs = dao.getAllUsers();
        while(rs.next()){
            String personId = rs.getString("Email");
            String pass = rs.getString("pass");
            details.add(new RegisterPerson(personId, pass));
        }
        System.out.println("details:-"+details);
        return details;
    }
}

