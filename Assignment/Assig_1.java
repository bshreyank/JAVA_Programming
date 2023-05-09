package Assignment;
import java.util.Scanner;

public class Assig_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter the operation (addition, subtraction, multiplication, division): ");
        String operation = input.next();

        double result;

        switch (operation) {
            case "addition":
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case "subtraction":
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case "multiplication":
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case "division":
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

    }
}
