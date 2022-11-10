package com.AzzahJSleepFN;
import com.AzzahJSleepFN.dbjson.Serializable;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Account extends Serializable{
    public String name;
    public String email;
    public String password;
    public double balance;
    public Renter renter;
    public final static String REGEX_EMAIL = "^[A-Za-z0-9]+@(.+)$";
    public final static String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";

    public Account(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = 0;
        //this.renter = null;
    }

    public Object write(){
        return null;
    }

    public boolean read(String a){
        return false;
    }

    public String toString(){
        return "====ACCOUNT====\n" + "\nName : " + name + "\nEmail : " + email + "\nPassword : " + password;
    }

    //Method to validate email and password
    public boolean validate() {
        Pattern patternEmail = Pattern.compile(REGEX_EMAIL);
        Pattern patternPassword = Pattern.compile(REGEX_PASSWORD);
        Matcher matcherEmail = patternEmail.matcher(email);
        Matcher matcherPassword = patternPassword.matcher(password);
        if (matcherEmail.matches() && matcherPassword.matches()) {
            return true;
        } else {
            return false;
        }
    }
    //getClass().getName() + " " + id + " " + name + " " + email + " " + password;
}