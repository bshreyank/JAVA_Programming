package File_Handeling;

import java.io.FileWriter;
import java.io.IOException;
public class files2 {    
    public static void main(String[] args) {
        try {           
            FileWriter myWriter = new FileWriter("test.txt");
            myWriter.write("Hello world");           
            myWriter.close();
            System.out.println("done");        
        } catch (IOException e) {
            System.out.println("error");            
            e.printStackTrace();
        }    
    }
}