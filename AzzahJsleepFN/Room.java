package AzzahJSleepFN;

public class Room extends Serializable implements FileParser
{    public int size;
     public String name;
     public Facility facility;
     public Price price;
     public City city;
     public BedType bedType;
     public String address;
     
    public Room (int id, String name, int size, Price price, 
    Facility facility, City city, String address){
        super(id);
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
