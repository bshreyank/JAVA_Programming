package Assignment_Set_2;

import java.util.Scanner;

public class a4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the latitude of the first point: ");
        double latitude1 = scanner.nextDouble();

        System.out.println("Enter the longitude of the first point: ");
        double longitude1 = scanner.nextDouble();

        System.out.println("Enter the latitude of the second point: ");
        double latitude2 = scanner.nextDouble();

        System.out.println("Enter the longitude of the second point: ");
        double longitude2 = scanner.nextDouble();

        double radiusOfEarth = 6371; // in kilometers

        double dLat = Math.toRadians(latitude2 - latitude1);
        double dLon = Math.toRadians(longitude2 - longitude1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                  Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) *
                  Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distance = radiusOfEarth * c;

        System.out.println("The distance between the two points is " + distance + " kilometers.");

        scanner.close();
    }
}

