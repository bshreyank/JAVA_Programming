package Abstraction;

public class abs {

  public static void main(String[] Args) {
    // unable to make object for abstract class       // bank_account abc = new bank_account();
    savings abcd = new savings();
    abcd.create_account();
    abcd.balance = 10000;
    abcd.view_balance();
  }
}

// abstract class
abstract class bank_account {
  int balance;

  public abstract void create_account();

  public void view_balance() {
    System.out.println("The current balance is:" + balance);
  }
}

class savings extends bank_account {

  // cannot be done // public abstract void andfs();    // method ko override kare ----
  public void create_account() {
    System.out.println("Bank account for savings created ");
  }
}
