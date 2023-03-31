package Methods;

import java.util.Scanner;

public class a_SquareOfNum {
    
    public static int getNumber(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Numbers: ");
        int num = sc.nextInt();
        return num;
    }

    public static void printSquare(int num){
        int square = num*num;
        System.out.println("The Square of "+num+" is "+square);
    }


    public static void main(String[] args) {
        int num = getNumber();
        printSquare(num);
    }    
}
