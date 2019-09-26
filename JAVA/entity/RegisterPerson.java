package com.springpro.springmaven.entity;

public class RegisterPerson {
    private String emailId;
    private String password;
    static private int programCode;
    static private String errorMsg;

    public  String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        RegisterPerson.errorMsg = errorMsg;
    }
    
    
    public int getProgramCode() {
        return programCode;
    }

    public void setProgramCode(int programCode) {
        RegisterPerson.programCode = programCode;
    }
    
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
