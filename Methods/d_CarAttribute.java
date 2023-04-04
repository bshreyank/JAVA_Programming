package Methods;
import java.util.Scanner;
/*
 * Create a class that has attributes about a car
 * including average, create methods that will calculate 
 * and return distance that can be covered by 
 * the car accepting the amount of fuel it has
 */
class car{
	int average =20 ;
	 void distance() 
     {
		 int fuel;
		 int dist;

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of fuel inserted in Litre :"  );
		 fuel = sc.nextInt();

		 dist = fuel*average;
		
         System.out.println("Distance travelled by car is " +dist+"km");
	}
}

public class d_CarAttribute {
    public static void main(String[] args) {
		car obj = new car();
		obj.distance();
    }
}


	

	

