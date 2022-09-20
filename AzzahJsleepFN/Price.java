package AzzahJsleepFN;

public class Price{
    public double rebate;
    public double price;
    public int discount;
    
    public Price (double price){
        this.discount = 0;
        this.rebate = 0;
        this.price = price;
    }
    public Price(double price, int discount){
        this.price = price;
        this.discount = discount;
        this.rebate = 0;
    }
    public Price (double price, double rebate){
        this.price = price;
        this.rebate = rebate;
        this.discount = 0;
    }
    private double getDiscountedPrice(){
        if(discount > 100.0){
            int discount = 100;
        }
        if(discount == 100.0){
            return 0.0;
        }
     double rebate = (double) price * (int) discount;
     this.price = (double)price - (double) rebate;
     
     return (int) price;
    }
    private double getRebatedPrice(){
        if(rebate > price){
           double rebate = (double) price;
        }
 
        return (double) price - (double) rebate;
    }
}
