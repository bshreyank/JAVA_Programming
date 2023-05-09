package Assignment.PracticeSet_1;
import java.util.Scanner;

public class a4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometers: ");
        int a = sc.nextInt();

        double miles = a*0.62137119;

        System.out.println("Miles: " +miles);
    }
}
