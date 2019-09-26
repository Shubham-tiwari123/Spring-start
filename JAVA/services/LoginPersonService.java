package com.springpro.springmaven.services;

import com.springpro.springmaven.dao.RegisterPersonDao;
import com.springpro.springmaven.entity.RegisterPerson;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Service;

@Service
public class LoginPersonService {

    RegisterPersonDao dao;
    RegisterPerson person;
    public LoginPersonService() {
        dao = new RegisterPersonDao();
        person = new RegisterPerson();
    }
    
    
    public void checkPerson(RegisterPerson data){
        System.out.println("service");
        String email = "";
        String pass = "";
        ResultSet resultSet = dao.getValues(data);
        try{
            if(person.getProgramCode()==200){
                System.out.println("first iff");
                while(resultSet.next()){
                    email = resultSet.getString("Email");
                    pass = resultSet.getString("pass");
                }
                if(email.equals(data.getEmailId()) && pass.equals(data.getPassword()))
                    person.setProgramCode(202);
                else{
                    person.setProgramCode(404);
                    person.setErrorMsg("invalid inputs");
                }
            }
        }
        catch(SQLException exception){
            person.setProgramCode(404);
            person.setErrorMsg(exception.getMessage());
        }
        
    }
}
