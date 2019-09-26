package com.springpro.springmaven.services;

import com.springpro.springmaven.dao.RegisterPersonDao;
import com.springpro.springmaven.entity.RegisterPerson;
import org.springframework.stereotype.Service;

@Service
public class RegisterPersonService{
    
    RegisterPersonDao dao;
    public RegisterPersonService() {
        dao = new RegisterPersonDao();
    }
    
    public void acceptValue(RegisterPerson details){
        dao.saveData(details);
    }
}

