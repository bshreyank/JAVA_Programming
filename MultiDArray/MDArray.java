package MultiDArray;

public class MDArray {
    public static void main(String[] args) {
        int [][] array = {
                            {15,45,64,67,15},           //array[0]
                            {23,98,48,67,78,45,67}      //array[1]
                        };

        //System.out.println(array[1][2]);

        for(int i = 0; i < array.length; i++) { // 0 and 1 
			
			for(int j = 0; j < array[i].length ; j++) { //array[1].length = 7
				System.out.print(array[i][j] + "  "); // i = 0  j = iteration 
			}//i
			System.out.println();//just to give a gap
		}//j

    }//main
}//class

