package Array;

public class Pattern {
    public static void main(String[] args) {
        char arr[] = {'*','/','*','/','*','/',};

        for(int i = (arr.length-1); i>0;i-=2){
            //System.out.println(i);
            for(int j=0;j<=i;j++){
                System.out.print(" " + arr[j]);
            }
            System.out.println("");

        }
        System.out.println(".");
    }
}

/*
 * package PP;

public class starslash {
 public static void main(String[] args) {
  int i;
  int j;
  for (i=1;i<=6;i+=2) {
   for (j=6;j>=i;j--) {
   if (j%2==0) System.out.print("*");
   else System.out.print("/");
    
    
   }
   System.out.println();
  }
  System.out.println(".");
 }

}
 */