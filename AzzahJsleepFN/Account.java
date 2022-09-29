package AzzahJSleepFN;

public class Account extends Serializable
{   public String name;
    public String email;
    public String password;
    
    public Account(int id, String name, String email, String password){
    super(id);
    this.name = name;
    this.email = email;
    this.password = password;
    }
    public String toString(){
        return "====ACCOUNT====\n" + "Your Id Number is : " + id + 
        "\nName : " + name + "\nEmail : " + email + "\nPassword : " + password;
    }
}