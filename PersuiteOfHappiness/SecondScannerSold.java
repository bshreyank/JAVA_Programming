package PersuiteOfHappiness;

import java.util.Scanner;

public class SecondScannerSold {
    public static void main(String[] args) {
        int scannerSold = 0;
        Scanner input = new Scanner(System.in);
        
        for(int i = 1; i <= 30; i++) {
           System.out.print("Did you sell a scanner today? (1 for yes, 0 for no): ");
           int sale = input.nextInt();
           scannerSold += sale;
           
           if(i == 3 && sale == 1) {
              System.out.println("Congratulations, you got your car back!");
           }
        }
        
        if(scannerSold >= 2) {
           System.out.println("Mission Accomplished");
        } else {
           System.out.println("Better luck next time");
        }
        
        input.close();
     }
}



/*

public static void main(String[] args) {
  
    int counter = 0;
    boolean test;
    
    Scanner sc = new Scanner(System.in);
    
    for(int i = 0 ; i < 31; i++) {
      
      System.out.println("Were you able to sell your scanner today, day number is " + i);
      test = sc.nextBoolean();
      if (test == true) {
        counter++;
      }            
      
    }
    if(counter == 2) {
      System.out.println("Mission Accomplished");
    }
    
    
  }

 */