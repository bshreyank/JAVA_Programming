public class OOPS{
public static void main(String[] args) {

    Pen p1 = new Pen();     //Created a pen object called p1
    p1.setColor("Blue");
    System.out.println(p1.color);

    BankAccount myAccount = new BankAccount();
    myAccount.username = "shryenk";
    
    //myAccount.password = "abha";//not possible bcoz it is private

    myAccount.setPassword("aluidshgl");
    }//main
}//class
/////////////////////////////////////////////////////////////////////////////
class BankAccount{
    public String username;
   // private String password;

    public void setPassword(String pwd){
       // password = pwd;
    }
}

/////////////////////////////////////////////////////////////////////////////
class Pen {     // Pen ka blueprint bana liya 
    
    //Pen ke aandar ye dono qualities hone chaheye 
    String color;   
    int tip;

    //Aur ye dono functions hone chaheye
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}//Class Pen