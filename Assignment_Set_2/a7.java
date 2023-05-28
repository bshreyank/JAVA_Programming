package Assignment_Set_2;

import java.util.Scanner;

public class a7 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the outer radius of the hollow cylinder: ");
        double outerRadius = scanner.nextDouble();

        System.out.print("Enter the inner radius of the hollow cylinder: ");
        double innerRadius = scanner.nextDouble();

        System.out.print("Enter the height of the hollow cylinder: ");
        double height = scanner.nextDouble();

        double area = calculateHollowCylinderArea(outerRadius, innerRadius, height);

        System.out.println("The area of the hollow cylinder is: " + area);
        scanner.close();
    }

    public static double calculateHollowCylinderArea(double outerRadius, double innerRadius, double height) {
        double outerArea = Math.PI * Math.pow(outerRadius, 2);
        double innerArea = Math.PI * Math.pow(innerRadius, 2);
        double lateralArea = 2 * Math.PI * (outerRadius + innerRadius) * height;

        double area = outerArea - innerArea + lateralArea;

        return area;
    }
}
