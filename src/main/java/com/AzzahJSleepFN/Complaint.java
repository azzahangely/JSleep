package com.AzzahJSleepFN;

import com.AzzahJSleepFN.dbjson.Serializable;
public class Complaint extends Serializable
{
    public String desc;
    public String date;
    
   public Complaint(int id, String date, String desc){
       super();
       this.desc = desc;
       this.date = date;
   }
   public String toString(){
       return "Your Id Number is : " + id + "\n" + "Date Month Year : " + 
       date + "\nDescription : " + desc;
   }
}
//getClass().getName() + " " + id + " " + name + " " + email + " " + password;
//GETCLASSNYA DIMANA HUHU BINGUNG