package com.AzzahJSleepFN;
import com.AzzahJSleepFN.dbjson.Serializable;

public class Account extends Serializable{
    public String name;
    public String email;
    public String password;
    public double balance;
    public Renter renter;
    public final static String REGEX_EMAIL = "^[A-Za-z0-9]+@(.+)$";
    public final static String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";

    public Account(String name, String email, String password){
    // int id -> super();
    this.name = name;
    this.email = email;
    this.password = password;
    }
    public Object write(){
        return 0;
    }
    public boolean read(String a){
        return true;
    }
    public String toString(){
        return "====ACCOUNT====\n" + "Your Id Number is : " + id +
        "\nName : " + name + "\nEmail : " + email + "\nPassword : " + password;
    }

    //Method to validate email and password
    public boolean validate() {
        if(this.email.matches(REGEX_EMAIL) && this.password.matches(REGEX_PASSWORD)){
            return true;
        }
        return false;
    }

    //getClass().getName() + " " + id + " " + name + " " + email + " " + password;
}