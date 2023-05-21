package Assignment_2;


import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side: ");
        int str = input.nextInt();

        double sqrt = Math.sqrt(3);

        double sqr= Math.pow(str,2);

        double a= (sqrt/4)*sqr;

        System.out.println(a);

        input.close();

    }
}
