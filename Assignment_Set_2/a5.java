package Assignment_Set_2;

import java.util.Scanner;

public class a5 {
    //V=π r*r h

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double volume = calculateCylinderVolume(radius, height);
        System.out.println("The volume of the cylinder is: " + volume);

        scanner.close();
    }

    public static double calculateCylinderVolume(double radius, double height) {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double volume = baseArea * height;
        return volume;
    }
    }