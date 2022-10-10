package AzzahJSleepFN;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Payment extends Invoice{
    
    private int roomId;
    public Date from;
    public Date to;
    
    SimpleDateFormat SDFormat = new SimpleDateFormat("Formatted Date : dd MM yyy");
    
    public Payment(int id, int buyerId, int renterId, int roomId, Date
    from, Date to){
        super(id, buyerId, renterId);
        this.roomId = roomId;
        this.from = new Date();
        this.to = new Date();
    }
    public Payment(int id, Account buyer, Renter renter, int roomId, Date
    from, Date to){
        super(id, buyer.id, renter.id);
        this.roomId = roomId;
        this.from = new Date();
        this.to = new Date();
    }
    public String print(){
        return "Your room id :" + roomId;
    }
    public int getRoomId(){
        return roomId;
    }
    public String getTime(){
        SimpleDateFormat SDFormat = new SimpleDateFormat("Formatted Date : dd MM yyy");
        String curr_time = SDFormat.format(this.time.getTime());
        return curr_time + "Formatted Date : " + curr_time; 
    }
  public static boolean makeBooking(Date from, Date to, Room room){
        SimpleDateFormat SDFormat = new SimpleDateFormat("dd MMMM yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(from);
        String bookFrom = SDFormat.format(from.getTime());
        String bookTo = SDFormat.format(to.getTime());
        if(availability(from, to, room)){
            while(from.before(to)){
                room.booked.add(from);
                cal.setTime(from);
                cal.add(Calendar.DATE, 1);
                from = cal.getTime();
            }
            return true;
        } else {
            return false;
        }
     }
    
    public static boolean availability(Date from, Date to, Room room){
        if(room.booked.isEmpty())
        {
            return true;
        }
        else{
            for(Date cek : room.booked){
                if((cek.equals(from) || cek.equals(to))){
                    return false;
                }
            }
        }
        return true;
   }
}
