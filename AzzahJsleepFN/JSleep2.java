package AzzahJSleepFN;

public class JSleep
{
  public static void main(String[] args){
      Payment testPayment = new Payment(2, 2, 2,2);
      System.out.println(testPayment.getTime());
      System.out.println(testPayment.getDuration());
      Price[] unfilteredArray = new Price[5];
      for(int i=0;i < unfilteredArray.length;i++){
          int j = 5000;
          unfilteredArray[i] = new Price((i+1)*j);
      }
      System.out.println("Price List");
      for(int i=0;i < unfilteredArray.length;i++){
            System.out.println(unfilteredArray[i].price);
      }
      System.out.println("Below 12000.0");
      System.out.println(Validate.filter(unfilteredArray, 12000,true));
      System.out.println("Above 10000.0");
      System.out.println(Validate.filter(unfilteredArray, 10000,false));
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