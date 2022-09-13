package AzzahJsleepFN;

public class Jsleep
{
  public static void main(String[] args){
  }
    public int getHotelID(){
      return 0;
  }
  public static String getHotelName(){
      return "hotel";
  }
  public boolean isDiscount(){
      return true;
  }
  public float getDiscountPercentage(int beforeDiscount, int afterDiscount){
      //jika nilai before < after maka tidak dianggap tidak ada potongan harga
      //if(beforeDiscount < afterDiscount)
          return 0;
  }
  public int getDiscountedPrice(int price, float discountPercentage){
     // if(discountPercentage > 100.0f)
    return 0;
  }
  public int getOriginalPrice(int discountedPrice, float discountPercentage){
      return 0;
  }
  public float getAdminFeePercentage(){
      return 0.05f;
  }
  public int getAdminfee(int price){
      return 0;
  }
  public int getTotalPrice(int price, int numberOfNight){
      return 0;
  }
  
  
}
