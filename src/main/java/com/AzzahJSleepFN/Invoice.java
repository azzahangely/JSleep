package com.AzzahJSleepFN;
import java.util.Calendar;
import java.util.*;

public class Invoice extends Serializable
{
    public int buyerId;
    public int renterId;
    public Date time;
    public PaymentStatus status;
    public RoomRating rating;
 
    protected Invoice(int id, int buyerId, int renterId){
        super();
        this.buyerId = buyerId;
        this.renterId = renterId;
        this.time = new Date();
        this.rating = RoomRating.NONE;
        this.status = PaymentStatus.WAITING;
    }
    public Invoice(int id, Account buyer, Renter renter){
        super();
        this.buyerId = buyer.id;
        this.renterId = renter.id;
        this.time = new Date();
        this.rating = RoomRating.NONE;
        this.status = PaymentStatus.WAITING;
    }
    public String print(){
        return "Your Buyer Id is :" + buyerId + "\n" + "Your Renter Id is :" + 
        renterId + "\n";
    }
    public enum RoomRating{
       NONE, 
       BAD, 
       NEUTRAL, 
       GOOD
    }
    public enum PaymentStatus{
       FAILED, 
       WAITING, 
       SUCCESS
    }
}
