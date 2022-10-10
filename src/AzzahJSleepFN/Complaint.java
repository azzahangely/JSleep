package AzzahJSleepFN;

public class Complaint extends Serializable
{
    public String desc;
    public String date;
    
   public Complaint(int id, String date, String desc){
       super(id);
       this.desc = desc;
       this.date = date;
   }
   public String toString(){
       return "Your Id Number is : " + id + "\n" + "Date Month Year : " + 
       date + "\nDescription : " + desc;
   }
}
