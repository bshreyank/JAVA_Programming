package OOP;

class Employee_const {
  int age;
  String name;
  int id;
  String married;

  Employee_const(int a, String str, int b, String mar) {
    age = a;
    name = str;
    id = b;
    married = mar;
  }

  public void display() {
    System.out.println(name + age + married);
  }

  public String got_married() {
    if (married == "Single") {
      married = "hogya kalyan";
      return "married";
    } else {
      married = "divorce";
      return "divorce";
    }
  }


public class Employee {
    public static void main(String[] args) {
        Employee_const sp = new Employee_const(25,"John" , 227, "Single");

        sp.display();
        sp.got_married();
        sp.display();
    }
    }

}