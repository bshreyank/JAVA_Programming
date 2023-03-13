package PersuiteOfHappiness;
import java.util.*;

public class first {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Did you sell the machine? (true/false): ");
        boolean isMachineSold = input.nextBoolean();
        
        if (isMachineSold) {
            System.out.println("Dad says: Yes, we will go to the park today.");
        } else {
            System.out.println("Dad says: No, we will not go to the park today.");
        }
        
        input.close();
    }

}//class
