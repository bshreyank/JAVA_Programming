package Assignment_Set_2;

import java.util.Scanner;

public class a6 {
    //C=2*pi*r

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        //double radius = scanner.nextDouble();
        

        scanner.close();
    }

    public static double calculateCylinderVolume(double radius, double height) 
    {
        double baseArea = 2*Math.PI*radius; 
        return baseArea;
    }
}