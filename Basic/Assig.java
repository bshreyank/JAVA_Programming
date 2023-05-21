// import java.util.Scanner;

// public class Assig {

//     public static void isFactorial(){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a number to find its factorial: ");
//         int num = input.nextInt();

//         // Using for loop
//         int factorial = 1;
//         for (int i = 1; i <= num; i++) {
//             factorial *= i;
//         }
//         System.out.printf("The factorial of %d is %d%n", num, factorial);

//         // Using while loop
//         factorial = 1;
//         int i = 1;
//         while (i <= num) {
//             factorial *= i;
//             i++;
//         }
//         System.out.printf("The factorial of %d is %d%n", num, factorial);
    
//     }

//     public static void main(String[] args) {
        
//         //Assignment 1
//         String F_name = "Nilkanth";
//         String L_name = "Java";

//         System.out.println(F_name.length()-L_name.length());

//         System.out.println("");//===================================================>
//         //Assignment 2
//         String alpha= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//         System.out.println(alpha.indexOf('K'));

//         System.out.println("");//===================================================>
//         //Assignment 3
//         String a= "Nilkanth";
//         String b= "Java"; 

//         System.out.println(a+b);
//         System.out.println(a.concat(b));

//         System.out.println("");//===================================================>
//         //Assignment 4
//         String ab = "Nilkanth";
//         int bc = 6197; 
//         int cd = 1234;
        
//         System.out.println(ab+bc+cd);

//         //Assignment 5
//         //isFactorial();

//         System.out.println("");//===================================================>
//         //Assignment 6
//         int count = 0;
//         int total = 0;
//         int n=30/2;
//         for (int i = 2; count<n; i+=2) {
//             System.out.print(i + " ");
//             total += i;
//             count++;
//         }
//         System.out.println("\nThe total : " + total);
    
//         System.out.println("");//===================================================>
        
//         //Assignment 7

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter minutes: ");
//         int minutes = sc.nextInt();

//         int years = minutes / (60 * 24 * 365);
//         int days = (minutes % (60 * 24 * 365)) / (60 * 24);

//         System.out.println(minutes+" minutes is "+years+" years and "+days+" days");

//         //Assignment 8
//         System.out.println("");//===================================================>
//         Scanner input = new Scanner(System.in);

//         // Read the integer from the user
//         System.out.print("Input an integer: ");
//         int num = input.nextInt();

//         // Convert the integer to a string and split it into an array of characters
//         String numStr = String.valueOf(num);
//         char[] digits = numStr.toCharArray();

//         // Print the digits
//         for (char digit : digits) {
//             System.out.print(digit + " ");
//         }

        
//     }
// }
