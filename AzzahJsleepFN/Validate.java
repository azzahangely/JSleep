package AzzahJSleepFN;
import java.util.ArrayList;

public class Validate
{
    public static ArrayList filter (Price[] list,int value ,boolean less){
        ArrayList arrPrice = new ArrayList();
            for(Price i : list){
                if(i.price <= value && less){
                    arrPrice.add(i.price);
                }  
                else if(i.price > value && !less){
                    arrPrice.add(i.price);
                }
        }
        return arrPrice;
    }
}