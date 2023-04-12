package Methods;

/*
 * Create a class that has attributes about a car
 * including average, create methods that will calculate 
 * and return distance that can be covered by 
 * the car accepting the amount of fuel it has
 */
class car {
	int average;
	void distance_possible(int fuel) {
		System.out.println("possible distance is - " + (fuel * average));
	}
	int rem_fuel(int dist, int ini_fuel) {
		int consumed_fuel = dist/average;
		return (ini_fuel - consumed_fuel);
	}
	
}

public class d_CarAttribute {
	public static void main(String[] args) {
		car city = new car();
		city.average = 30;
		city.distance_possible(12);
		int a = city.rem_fuel(50, 5);
		System.out.println("remainin fuel is - " + a);
		
	}
}

	

	

