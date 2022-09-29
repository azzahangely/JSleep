package AzzahJSleepFN;

public class Invoice extends Serializable
{
    public int buyerId;
    public int renterId;
    public String time;
    public PaymentStatus status;
    public RoomRating rating;
 
    protected Invoice(int id, int buyerId, int renterId, String time){
        super(id);
        this.buyerId = buyerId;
        this.renterId = renterId;
        this.time = time;
        this.rating = RoomRating.NONE;
        this.status = PaymentStatus.WAITING;
    }
    public Invoice(int id, Account buyer, Renter renter, String time){
        super(id);
        this.buyerId = buyer.id;
        this.renterId = renter.id;
        this.time = time;    
    }
    public String print(){
        return "Your Buyer Id is :" + buyerId + "\n" + "Your Renter Id is :" + 
        renterId + "\n" + (String)time;
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
