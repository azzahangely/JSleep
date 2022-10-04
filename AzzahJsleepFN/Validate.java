package AzzahJSleepFN;
import java.util.ArrayList;

public class Validate
{
    public static ArrayList filter (Price[] list,int value ,boolean less){
        ArrayList<Price> isPrice = new ArrayList <Price>();
        if(less){
            for(Price i : list){
                if(i.price <= value){
                    isPrice.add(i);
                }
            }
        } 
        else {
            for(Price i : list){
                if ( i.price > value){
                    isPrice.add(i);
                }
            }
        }
        return isPrice; 
    }
}