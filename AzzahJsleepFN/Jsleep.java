package AzzahJSleepFN;

public class JSleep
{
  public static void main(String[] args){
      Payment testRoom = new Payment(1, 1, 1, " ", 1, " ", " ");
      Invoice testInvoice = new Invoice(2,2,2," ");
      System.out.println(testRoom.print());
      System.out.println(testInvoice.print());
      

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