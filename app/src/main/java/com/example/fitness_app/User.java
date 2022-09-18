package com.example.fitness_app;

public class User {
    String user_name,user_email,user_password,user_gender;

    public User(){

    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public User(String user_name, String user_email, String user_password, String user_gender) {
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_gender = user_gender;
    }
}
