package Inheritance;

class person{
    String name;    
    int age;
    void printer(){        
        System.out.println(name);
    }
}
class student extends person{    
    int rollno;
}

public class single {
    public static void main(String args[]){        
        student shreyank = new student();
        shreyank.rollno = 1234;        
        shreyank.name = "Shreyank";
        System.out.println(shreyank.name);        
        shreyank.printer(); //Methods can be called in Inheritance
    }}