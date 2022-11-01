package AzzahJSleepFN;
import java.sql.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.*;


public class JSleep {
   class Country {
       public String name;
       public int population;
       public List<String> listOfStates;
   }


    public static void main(String[] args) {

       Renter testRegex = new Renter("Netlab_", "081234567890", "Jl Jalan");
       Renter testRegexFail = new Renter("netlab", "081", "Jalan");
        System.out.println(testRegex.validate());
        System.out.println(testRegexFail.validate());

        try {
            String filepath = "C:\\Users\\HP 15s\\OOP\\Jsleep\\src\\json\\randomRoomList.json";
            JsonTable<Room> tableRoom = new JsonTable<>(Room.class, filepath);
            List<Room> filterTableRoom = filterByCity(tableRoom, "medan", 0, 5);
            filterTableRoom.forEach(room -> System.out.println(room.toString()));
        }
        catch (Throwable t){
            t.printStackTrace();
        }
       /*
        String filepath= "C:\\Users\\HP 15s\\OOP\\Jsleep\\city.json";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            Country input = gson.fromJson(br, Country.class);
            System.out.println("name : " + input.name);
            System.out.println("population : " + input.population);
            System.out.println("states : ");
            input.listOfStates.forEach(state -> System.out.println(state));
        } catch (IOException e) {
            e.printStackTrace();
        }

        */
    }

    public static Room createRoom(){
       Price price = new Price(10000.0, 10);
       Room room = new Room(2, "Restaurant", 35, price, Facility.AC, City.BALI, "Jl. jalan");
       return room;
    }

    public static List<Room> filterByAccountId(List<Room> list, int accountId, int page, int pageSize){

        return Algorithm.<Room>paginate(list,page,pageSize,room -> room.accountId == accountId);
    }

    public static List<Room> filterByPrice(List<Room> list, double minPrice, double maxPrice){
        return Algorithm.<Room>collect(list,room -> room.price.price >= minPrice && room.price.price <= maxPrice);
    }

    public static List<Room> filterByCity(List<Room> list, String search, int page, int pageSize){
        return Algorithm.paginate(list, page, pageSize, room -> room.city.toString().toLowerCase().contains(search.toLowerCase()));
    }
}
    /* comment dulu
    ArrayList<Room> RoomSerialized = new ArrayList<Room>();
      for (int i = 0; i < 5; i++) {
          RoomSerialized.add(i, JSleep.createRoom());
          System.out.println(RoomSerialized.get(i).toString());
      }
      */
      /*Room RoomA = JSleep.createRoom();
      Room RoomB = JSleep.createRoom();
      System.out.println("Membuat booking dari tanggal 15 hingga 18");
      Date start = Date.valueOf("2022-8-15");
      Date end = Date.valueOf("2022-8-20");
      System.out.println(Payment.makeBooking(start, end,RoomA));
      System.out.println("Membuat booking dari tanggal 15 hingga 18");
      Date start2 = Date.valueOf("2022-8-18");
      Date end2 = Date.valueOf("2022-8-20");
      System.out.println(Payment.makeBooking(start2, end2,RoomA));
      System.out.println("Membuat booking dari tanggal 15 hingga 18 untuk kamar berbeda");
      Date start3 = Date.valueOf("2022-8-18");
      Date end3 = Date.valueOf("2022-8-20");
      System.out.println(Payment.makeBooking(start3, end3,RoomB));

       */




    /*public static Room createRoom(){
      Price price = new Price(200000, 15);
      Room room = new Room(1234, "hotel", 20, price, 
    Facility.WiFi, City.DEPOK, "JL. Margonda Raya");
      return room;
  }

  /*
   * Price price = new Price(200000, 15);
      Room room = new Room("hotel", 20, price, Facility.WiFi);
      return room;
  public static Account createAccount(){
      Account account = new Account("Azzah","azzah.azkiyah@ui.ac.id", "tutam");
      return account;
  }
  
  public static Price cekHarga(){
      Price harga = new Price(250, 10);
      Voucher promo = new Voucher("Deluxe",00123, Type.DISCOUNT, 100, 10);
      return harga;
  }*/
