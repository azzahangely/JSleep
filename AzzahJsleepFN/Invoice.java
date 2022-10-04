package AzzahJSleepFN;
import java.util.Calendar;

public class Invoice extends Serializable
{
    public int buyerId;
    public int renterId;
    public Calendar time;
    public PaymentStatus status;
    public RoomRating rating;
 
    protected Invoice(int id, int buyerId, int renterId){
        super(id);
        this.buyerId = buyerId;
        this.renterId = renterId;
        Calendar time = Calendar.getInstance();
        this.rating = RoomRating.NONE;
        this.status = PaymentStatus.WAITING;
    }
    public Invoice(int id, Account buyer, Renter renter){
        super(id);
        this.buyerId = buyer.id;
        this.renterId = renter.id;   
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
