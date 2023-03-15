/*
1. Write a program that removes consecutive duplicate characters from a string.
Given string str, remove all the consecutive duplicates from a string.

For e.g:

String: 'Scaaaleer Famiillyyyy'. 

Output: Scaler Family 
*/
//=======================================>
/*
Output:

Enter a string: 
Scaaaleer Famiillyyyy

String after removing consecutive duplicate characters: Scaler Family
 */
//=======================================>

package Manipal;


import java.util.*;

public class DuplicateString {
    // Function to remove adjacent duplicates characters from a string
    public static String removeConsecutiveDuplicates(String str)
    {
        // base case
        if (str == null) 
       {
            return null;
        }
 
        char[] chars = str.toCharArray();
        char prev = 0;
        int k = 0;
 
        for (char c: chars)
        {
            if (prev != c)
            {
                chars[k++] = c;
                prev = c;
            }
        }
 
        return new String(chars).substring(0, k);
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter a string: "); 
        String str= sc.nextLine();  
        var answer = removeConsecutiveDuplicates(str);
        System.out.println("\nString after removing consecutive duplicate characters: " + answer );
    }
}
