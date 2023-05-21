package Assignment_Set_1.PracticeSet_1;


import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        if (input.hasNextInt()) {
            System.out.println("The entered number is an integer.");
        } else {
            System.out.println("The entered number is not an integer.");
        }
        
        input.close();
    }
}
