package AzzahJSleepFN;

public class JSleep
{
  public static void main(String[] args){

      Account make = createAccount();
      System.out.println(make.name);
      System.out.println(make.email);
      System.out.println(make.password);

      Room test = createRoom();
      System.out.println(test.name);
      System.out.println(test.size);
      System.out.println(test.price.price);
      System.out.println(test.facility);
       
      /*Price harga = cekHarga();
      System.out.println(promo.canApply(harga));
      System.out.println(promo.apply(harga));
      System.out.println(promo.canApply(harga));
     */
  }
  
  public static Room createRoom(){
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
  }
}