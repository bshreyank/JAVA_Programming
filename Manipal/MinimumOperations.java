// /*
// Write a program to find the minimum number of operations to make all elements of the array equal.
// Given an array 'scaler[]' of 'n' positive integers, you must determine the minimum number of operations necessary to make all elements of the array equal. Array elements can be added to, multiplied by, subtracted from, or divided by. Any operation on an element of the array will be considered a single operation.
// */
// /*
// Output:

// Enter total number of elements: 
// 4   

// Enter elements of the array: 
// 3
// 5
// 9
// 6

// Minimum required operations = 3
//  */

//  package Manipal;

//  import java.util.*;
 
//  public class MinimumOperations {
//      //Function to return minimum operations needed to equalize array elements
//      static int minOpera(int scaler[], int n) {
//          HashMap<Integer, Integer> p = new HashMap<>();
//          for (int i = 0; i < n; i++) {
//              if (p.containsKey(scaler[i])) {
//                  p.put(scaler[i], p.get(scaler[i]) + 1);
//              } else {
//                  p.put(scaler[i], 1);
//              }
//          }
//          int maxFreq = Integer.MIN_VALUE;
//          maxFreq = Collections.max(p.entrySet(),
//                  Comparator.comparingInt(Map.Entry::getKey)).getValue();
 
//          // Return the minimum operations required
//          return (n - maxFreq);
//      }
 
//      // Driver code
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter total number of elements: ");
//          int n = sc.nextInt();
//          System.out.println("\nEnter elements of the array: ");
//          int[] scaler = new int[10];
//          for (int i = 0; i < n; i++) {
//              scaler[i] = sc.nextInt();
//          }
//          System.out.println("\nMinimum required operations = " + minOpera(scaler, n));
//      }
//  }
