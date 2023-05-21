// /* Q.
//  * Create a method named calculator that will accept an array of 5 numbers and return 
//  * the addition, subtraction, multiplication of the elements in another array.  
//  */
// package Methods;
// import java.util.Scanner; 



// public class c_Claci {

//   /*AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI

//   public static int[] calculator(int[] numbers) {
    
//     int[] results = new int[3];

//     int addition = 0;
//     int subtraction = numbers[0];
//     int multiplication = 1;

//     for (int i = 0; i < numbers.length; i++) {
//       addition += numbers[i];
//       multiplication *= numbers[i];

//       if (i > 0) {
//         subtraction -= numbers[i];
//       }
//     }

//     results[0] = addition;
//     results[1] = subtraction;
//     results[2] = multiplication;

//     return results;
//   }//calculator 

//   public static void main(String[] args) {
//     int[] numbers = { 5, 3, 7, 2, 8 };
//     int[] results = calculator(numbers);
//     System.out.println("Addition: " + results[0]);
//     System.out.println("Subtraction: " + results[1]);
//     System.out.println("Multiplication: " + results[2]);
//   }//main
  
//   *///AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI
  
  
//    void calculate() 
//   { 
    
//     Scanner sc=new Scanner(System.in); 
//     System.out.println("Enter The number in the array "); 
//     int v=sc.nextInt(); 

//     int[] arr=new int[5]; 

//     int sum=0; 
//     int sum1=1; 
//     int i; 
//     int diff=arr[0]; 


//     System.out.println("Enter the element of the array "); 
//     for( i=0;i<arr.length;i++) { 
//      arr[i]=sc.nextInt(); 
//     } 


//     System.out.println("-----------------------------------------------------------------------"); 


//     System.out.println("the Addition of the array Element"); 
//     for( i=0;i<arr.length;i++) { 
//      sum=sum+arr[i]; 
//     } 
//     System.out.println("the Addition of the array is : "+sum); 


//     System.out.println("-----------------------------------------------------------------------"); 
     
//     System.out.println(" the multipication of the array Element "); 
//     for( i=0;i<arr.length;i++) { 
//      sum1=sum1*arr[i]; 
//     } 
//     System.out.println(" the multipication of the array is: "+sum1); 


//     System.out.println("-----------------------------------------------------------------------"); 


//     System.out.println("the Subtraction of the array Element"); 
//     for(i=0;i<arr.length;i++) { 
//     if(i>0) { 
//      diff-=arr[i]; 
//     }} 
//     System.out.println("the Subtraction of the array is: "+diff); 
    
//   } 
//    public static void main(String arr[]) { 
//     c_Claci obj=new c_Claci(); 
//    obj.calculate(); 
//    } 
   


// }//Class claci
