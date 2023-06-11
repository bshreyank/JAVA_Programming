package Assignment_Set_2;

import java.util.Scanner;

public class a2{
    public static void main(String[] args) {
        //Simple interest = P*N*R/100;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal:");
        int principal = scanner.nextInt();

        
        System.out.println("Enter Time:");
        int time = scanner.nextInt();

        
        System.out.println("Enter Rate of Interest:");
        int rate = scanner.nextInt();


        int SI= (principal*rate*time)/100;
        System.out.println("The simple interest is: "+SI);

    }
}