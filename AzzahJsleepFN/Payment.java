package AzzahJSleepFN;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Payment extends Invoice
{
    
    private int roomId;
    public Calendar from;
    public Calendar to;
    
    SimpleDateFormat SDFormat = new SimpleDateFormat("Formatted Date : dd MM yyy");
    
    public Payment(int id, int buyerId, int renterId, int roomId){
        super(id, buyerId, renterId);
        this.roomId = roomId;
        this.from = Calendar.getInstance();
        this.to = Calendar.getInstance();
        this.from.getTime();
        this.to.add(Calendar.DATE, 2);
    }
    public Payment(int id, Account buyer, Renter renter){
        super(id, buyer.id, renter.id);
        this.roomId = roomId;
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
    public String getDuration(){
      SimpleDateFormat SDFormat = new SimpleDateFormat("Formatted Date : dd MM yyy");
      String from = SDFormat.format(this.from.getTime());
      String to = SDFormat.format(this.to.getTime());
      return from + "-" + to;
    }
}
