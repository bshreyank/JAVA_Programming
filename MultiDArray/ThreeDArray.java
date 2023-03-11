package MultiDArray;
 
public class ThreeDArray {
    public static void main(String[] args) {
		int[][][] array = {
								{
									{10,20,30},
									{35,45,98,75}
								},
								
								{
									{25,21,32},
									{34,54,18,5}
								}
                        };
		
		
		for(int i = 0; i < array.length; i++) { // 0 and 1 
			
			for(int j = 0; j < array[i].length ; j++) { //array[1].length = 7

				for(int k = 0; k < array[i][j].length ; k++) {
					System.out.print(array[i][j][k] + "  ");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println();
			
		}
		
	}//main

}//class
