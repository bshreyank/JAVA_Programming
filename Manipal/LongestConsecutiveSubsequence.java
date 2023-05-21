// package Manipal;
// /**
//  * LongestConsecutiveSubsequence:
 
//  * Given an array scaler[] of n integers, determine the length of the longest consecutive subsequence. 
//  * There is no particular order to the consecutive numbers. 

// Output:

// Enter total number of elements: 
// 8

// Enter elements of the array: 
// 4
// 6
// 5
// 7
// 2
// 9
// 8
// 1

// Length of the longest contiguous subsequence is: 4
//  */

//  import java.util.*; 

// public class LongestConsecutiveSubsequence {

//     static int LongConsSubseq(int scaler[], int n)
//     { 
//         Arrays.sort(scaler);
//         int res = 0, count = 0;       
//         ArrayList<Integer> a = new ArrayList<Integer>();
//         a.add(10);
       
//         for (int i = 1; i < n; i++)
//         {
//             if (scaler[i] != scaler[i - 1])
//                 a.add(scaler[i]);
//         }
     
//         // Traverse the array to find the maximum length
//         for (int i = 0; i < a.size(); i++)
//         {
//             if (i > 0 &&a.get(i) == a.get(i - 1) + 1)
//                 count++;
//             else
//                 count = 1;

//             res = Math.max(res, count);
//         }
//         return res;
//     }
 
//     // Driver code
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in); 
//         System.out.println("Enter total number of elements: "); 
//         int n = sc.nextInt(); 
//         System.out.println("\nEnter elements of the array: ");  
//         int[] scaler = new int[10];  
//         for (int i = 0 ; i < n; i++ )
//         {
//             scaler[i]= sc.nextInt();    
//         }  
//         System.out.println("\nLength of the longest contiguous subsequence is: " + LongConsSubseq(scaler, n));
//     }
// }