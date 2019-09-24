package com.springpro.springmaven.dao;

public class UserDetails {
    private int personId;
    private String name;
    private String add;

    public UserDetails() {
    }

    
    public UserDetails(int personId, String name, String add) {
        this.personId = personId;
        this.name = name;
        this.add = add;
    }

    
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    
    
}
