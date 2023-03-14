package com.javacto.userservice;

public abstract class User {
    private int userId ; // an abstract class, Polymorphic
    private String name;
    private String password;

   public abstract void run();//Polymorphic function different user can get different function


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}