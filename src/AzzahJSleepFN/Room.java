package AzzahJSleepFN;
import java.util.Date;
import java.util.ArrayList;


public class Room extends Serializable
{
    public BedType bedType;
    public int accountId;
    public Facility facility;
    public City city;
    public int size;
    public String name;
    public ArrayList<Date> booked;
    public String address;
    public Price price;


    public Room(int accountId, String name, int size, Price price, Facility facility,
                City city, String address){

        this.accountId = accountId;
        this.name = name;
        this.size = size;
        this.price = price;
        this.facility = facility;
        this.city = city;
        this.address = address;
        this.bedType = BedType.SINGLE;
    }
    public String toString(){
        return "=====Room=====\n" + "Your Id Number is : " + (int)id + 
        "\nName : " + name + "\nChecking Price. . . \n" + price + "\nFacility : " + facility + "\nCity : " + city + "\nAddress : " + address;
        
    }
        public Object write(){
        return 0;
    }
    public boolean read(String a){
        return true;
    }
}
