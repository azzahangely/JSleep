package AzzahJsleepFN;

public class Rating
{
    private long total;
    private long count;
    
   public Rating (){
       this.total = 0;
       this.count = 0;
   }
   public void insert(int rating){
       this.total += (int) rating;
       this.count++;
   }
   public long getCount(){
       return this.count;
   }
   public long getTotal(){
       return this.total;
   }
   public double getAverage(){
       return (double)this.total/this.count;
   }
}
