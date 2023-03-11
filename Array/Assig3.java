package Array;

public class Assig3 {
    public static void main(String[] args) {
        

        // Q1- How do you find the duplicate number on a given integer array?
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                       }
            }
        }

        //Q2- 





    }//main
}//class
