package com.tcs.mydemo.model;

public class User
{

   private  String name;
   private String id;
    private String emailid;

    public User(String name, String id, String emailid) {
        this.name = name;
        this.id = id;
        this.emailid = emailid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }



}
