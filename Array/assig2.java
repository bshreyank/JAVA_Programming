/*
1. Write a Java program to calculate the average value of array elements 

2. Write a Java program to test if an array contains a specific value. 

3. Write a Java program to compute the average value of an array of integers except the largest and smallest values

4. Write a Java program to copy an array by iterating the array

5. Write a Java program to find the maximum and minimum value of an array.

6. Write a Java program to find the common elements between two arrays.

7. Write a Java program to remove duplicate elements from an array.
 */
/*
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class assig2 {
    public static void main(String[] args) {
        
        int[] num = {3, 8, 4, 6, 1, 9, 2, 5, 7};*/
        
//assig 1 =====================================================================================>
/*
        int sum = 0;
        for (int abc : num) {
            sum += abc;
        }
        int size=num.length;
        int average = sum / size;
        System.out.println("Average="+average);
*/
        
//assig 2 =====================================================================================>
/*  
        int key=10;
        boolean found=false;
        for(int i=0;i<num.length;i++){
            if(key==num[i]){
               found = true;
               break; 
            }  
        }
        if(found){
            System.out.println("Found it");
        }else{
            System.out.println("Not Found !!!");
        }*/
     
//assig 3 =====================================================================================>
    /*  int min = num[0];
      int max = num[0];

      for(int i=0; i<num.length;i++){
        if(num[i]<min){
            min=num[i];
        }
        if(num[i]>max){
            max=num[i];
        }
      }

      int sum=0;
      int count=0;

      for(int i=0;i<num.length;i++){
        if(num[i]!=min && num[i]!=max){
            sum+=num[i];
            count++;
        }
      }
      int average=sum/count;
      System.out.println(average);*/
//assig 4 =====================================================================================>
        /*int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Copied array: " + Arrays.toString(arr2));
    }

    //another solution
    int[] arr = {1, 2, 3, 4, 5};
    int[] copy_arr = new int[arr.length];
    
    for(int i = 0; i < arr.length; i++) {
      copy_arr[i] = arr[i];
    }
    
    for(int i = 0; i < copy_arr.length; i++) {
      System.out.print("  " + copy_arr[i]);
    }*/

//assig 5 =====================================================================================>
 /*int min=num[0];
 int max=num[0];

 for(int i=0;i<num.length;i++){
     if(num[i]<min){
         min=num[i];
     }
     if(num[i]>max){
         max=num[i];
    }
 }
 System.out.println("Max:"+max);
 System.out.println("Min:"+min);*/


 //assig 6 =====================================================================================>
 /*/
 int[] arr1 = {1, 2, 3, 4, 5};
 int[] arr2 = {4, 5, 6, 7, 8};

for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr1.length;j++){
        if(arr1[i]==arr2[j]){
            System.out.println(arr1[i]);
        }
    }
}*/
//assig 7 =====================================================================================>
/*
int[] arr1 = {1, 2, 3, 4, 5};
int[] arr2 = {4, 5, 6, 7, 8};

for(int i=0;i<arr1.length;i++){
   for(int j=0;j<arr1.length;j++){
       if(arr1[i]==arr2[j]){
           System.out.println(arr1[i]);
       }
   }



    }//main
}//class
*/