package Assignment.PracticeSet_3;
import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String replacedStr = str.replace(" ", "_");

        System.out.println("String with spaces replaced: " + replacedStr);

        input.close();
    }
}


