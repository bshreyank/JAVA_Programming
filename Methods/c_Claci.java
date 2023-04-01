/* Q.
 * Create a method named calculator that will accept an array of 5 numbers and return 
 * the addition, subtraction, multiplication of the elements in another array.  
 */


package Methods;

public class c_Claci {

  /*AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI

  public static int[] calculator(int[] numbers) {
    
    int[] results = new int[3];

    int addition = 0;
    int subtraction = numbers[0];
    int multiplication = 1;

    for (int i = 0; i < numbers.length; i++) {
      addition += numbers[i];
      multiplication *= numbers[i];

      if (i > 0) {
        subtraction -= numbers[i];
      }
    }

    results[0] = addition;
    results[1] = subtraction;
    results[2] = multiplication;

    return results;
  }//calculator 

  public static void main(String[] args) {
    int[] numbers = { 5, 3, 7, 2, 8 };
    int[] results = calculator(numbers);
    System.out.println("Addition: " + results[0]);
    System.out.println("Subtraction: " + results[1]);
    System.out.println("Multiplication: " + results[2]);
  }//main
  
  *///AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI



}//Class claci
