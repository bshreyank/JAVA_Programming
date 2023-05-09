package Assignment.PracticeSet_3;
import java.util.Scanner;

public class a1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String lowercaseStr = str.toLowerCase();

        System.out.println("Lowercase string: " + lowercaseStr);

        
    }
}

