package com.springpro.springmaven.dao;

import com.springpro.springmaven.entity.RegisterPerson;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterPersonDao extends DatabaseConn{
    
    public void saveData(RegisterPerson get){
        try {
            initializeDbConnection();
            smt.executeUpdate("INSERT INTO register(Email, pass) VALUES('"+get.getEmailId()+"',"
                    + "'"+get.getPassword()+"')");
            get.setProgramCode(200);
        } catch (SQLException ex) {
            get.setProgramCode(404);
            get.setErrorMsg(ex.toString());
            System.out.println("ex:-"+ex);
        }
    }
    
    public ResultSet getValues(RegisterPerson value){
        try {
            System.out.println("try");
            initializeDbConnection();
            resultSet = smt.executeQuery("SELECT * FROM register WHERE Email='"+value.getEmailId()+"'");
            value.setProgramCode(200);
            return resultSet;
        } catch (SQLException ex) {
            System.out.println("catch");
            value.setProgramCode(404);
            value.setErrorMsg(ex.toString());
            System.out.println("ex:-"+ex);
            return resultSet;
        }
    }
}
