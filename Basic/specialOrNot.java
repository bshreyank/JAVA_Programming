public class specialOrNot {

    public static void isSpecial(int num){
        
        String numStr = String.valueOf(num);
        
        // Check if the number has an even number of digits
        //if (numStr.length() % 2 != 0) {
        //    System.out.println("Wrong Number");
       // }
        
        // Split the number into two equal halves
        int half = numStr.length() / 2;

        String p1 = numStr.substring(0, half);
        String p2 = numStr.substring(half);
        
        //converting string to number using parseInt
        int a = Integer.parseInt(p1);
        int b = Integer.parseInt(p2);
        
        // Check if the square of the sum of the halves equals the number itself
        int sum = a + b;
        int square = sum * sum;

        if (square == num) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        for (int num = 1000; num <=999999; num++) {
            isSpecial(num);
        }//for

    }//main
}//class
