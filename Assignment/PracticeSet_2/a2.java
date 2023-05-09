package Assignment.PracticeSet_2;
import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the grade to encrypt: ");
        int originalGrade = input.nextInt();
        
        
        int encryptedGrade = originalGrade + 8;
        System.out.println("Encrypted Grade: " + encryptedGrade);
        
       
        int decryptedGrade = encryptedGrade - 8;
        System.out.println("Decrypted Grade: " + decryptedGrade);
        
        input.close();
    }
}
