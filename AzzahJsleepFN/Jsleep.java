package AzzahJsleepFN;

public class Jsleep
{
  public static void main(String[] args){
  }
    public int getHotelID(){
      return 0;
  }
  public String getHotelName(){
      return "hotel";
  }
  public boolean isDiscount(){
      return true;
  }
  public float getDiscountPercentage(int beforeDiscount, int afterDiscount){
      //jika nilai before < after maka tidak dianggap tidak ada potongan harga
      if(beforeDiscount < afterDiscount){
          return 0;
      }
      float discountPrice = (float) beforeDiscount - (float) afterDiscount;
      float discountPercentage = ((float) discountPrice/(float)beforeDiscount)* 100;
      return (float) discountPercentage;
      }
  public int getDiscountedPrice(int price, float discountPercentage){
      if(discountPercentage > 100.0f){
          return 0;
      }
      float discountedPrice = (int)price - ((int)price * (float)discountPercentage/100);
      return (int)discountedPrice;
  }
  public static int getOriginalPrice(int discountedPrice, float discountPercentage){
      if(discountedPrice == 0){
          return 0;
      }
      if (discountPercentage == 100){
      return discountedPrice;
      }
       float originalPrice = (float)discountedPrice * 100/(float)discountPercentage;
       return (int) originalPrice;
 }
  public float getAdminFeePercentage(){
      return 0.05f;
  }
  public int getAdminfee(int price){
      float adminFee = (float)(int)price * getAdminFeePercentage();
      return (int) adminFee;
  }
  public int getTotalPrice(int price, int numberOfNight){
      int totalPrice = (int) price * (int) numberOfNight;
      return (int) totalPrice;
  }
  
  
}
