package AzzahJSleepFN;

public class Account extends Serializable implements FileParser
{   public String name;
    public String email;
    public String password;
    
    public Account(int id, String name, String email, String password){
    super(id);
    this.name = name;
    this.email = email;
    this.password = password;
    }
    public Object write(){
        return 0;
    }
    public boolean read(String a){
        return true;
    }
    public String toString(){
        return "====ACCOUNT====\n" + "Your Id Number is : " + id + 
        "\nName : " + name + "\nEmail : " + email + "\nPassword : " + password;
    }
}