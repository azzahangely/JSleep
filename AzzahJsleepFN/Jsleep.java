package AzzahJSleepFN;

public class JSleep
{
  public static void main(String[] args){
      Complaint testComplain = new Complaint(1, "23 August 2022", "Bad Quality");
      Price testPrice = new Price(100000, 20000);
      Room testRoom = new Room(1, "Presidential Suite", 5, testPrice,
      Facility.FitnessCenter, City.DEPOK, "JL. Margonda Raya");
      Account testAccount = new Account(1, "Bob", "bob@gmail.com", "bob");
      Rating testRating = new Rating();
      System.out.println(testComplain.toString());
      System.out.println(testRoom.toString());
      System.out.println(testAccount.toString());
      System.out.println(testPrice.toString());
      System.out.println(testRating.toString());
  }
  
  /*public static Room createRoom(){
      Price price = new Price(200000, 15);
      Room room = new Room("hotel", 20, price, Facility.WiFi);
      return room;
  }
  
  public static Account createAccount(){
      Account account = new Account("Azzah","azzah.azkiyah@ui.ac.id", "tutam");
      return account;
  }
  
  public static Price cekHarga(){
      Price harga = new Price(250, 10);
      Voucher promo = new Voucher("Deluxe",00123, Type.DISCOUNT, 100, 10);
      return harga;
  }*/
}