package com.AzzahJSleepFN;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Payment extends Invoice {

    private int roomId;
    public Date from;
    public Date to;

    public Payment(int buyerId, int renterId, int roomId, Date from, Date to) {
        super(buyerId, renterId);
        this.roomId = roomId;
        this.from = from;
        this.to = to;

    }

    public Payment(Account buyer, Renter renter, int roomId, Date from, Date to) {
        super(buyer, renter);
        this.roomId = roomId;
        this.from = from;
        this.to = to;

    }

    public int getRoomId() {
        return roomId;
    }

    public static boolean makeBooking(Date from,Date to,Room room){
        return false;
    }

    public static boolean availability(Date from,Date to,Room room){
       return true;
    }

    /*public String getTime(){
        SimpleDateFormat SDFormat = new SimpleDateFormat("'Formatted Date' = dd MMMM yyyy");
        String currTime = SDFormat.format(time.getTime());
        return currTime;
    }*/

    @Override
    public String print(){
        return "Payment{" +
                "roomId=" + roomId +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

}