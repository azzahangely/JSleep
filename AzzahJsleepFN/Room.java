package AzzahJSleepFN;

public class Room
{    public int size;
     public String name;
     public Facility facility;
     public Price price;
     
    public Room (String name, int weight, Price price, Facility facility){
        this.name = name;
        size = weight;
        this.price = price;
        this.facility = facility;
    }
}
