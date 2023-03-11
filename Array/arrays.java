package Array;

public class arrays {
    public static void main(String[] args) {
       
       /* String[] arr = {"a","b","c","d"};
       
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }

       for(String mas : arr){
        System.out.println(mas);
       }
       */

       //Write a Java program to check if an element is present in array
       int [] num = {10,20,30,40,50,45,12,13,15};

       int target = 40;
       int counter = 0;

       for(int mas: num){
        if(mas==target){
            counter++;
        }//if      
       }//for
       
       if(counter>0){
        System.out.println("Present");
       }else{
        System.out.println("Absent");
       }

    }
}
