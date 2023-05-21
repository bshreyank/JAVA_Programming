package Assignment_Set_1.PracticeSet_2;
import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int userNumber = input.nextInt();
        
        int givenNumber = 10; // Example given number
        
        if (givenNumber > userNumber) {
            System.out.println("The given number is greater than the user-entered number.");
        } else if (givenNumber < userNumber) {
            System.out.println("The given number is smaller than the user-entered number.");
        } else {
            System.out.println("The given number is equal to the user-entered number.");
        }
        
        input.close();
    }
}
