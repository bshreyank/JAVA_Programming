package File_Handeling;

import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errorsimport java.util.Scanner; // Import the Scanner class to read text files
public class files3 {
    public static void main(String[] args) {        
        try {
            File myObj = new File("test.txt");            
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {                
                String text = myReader.nextLine();
                System.out.println(text);            
            }
            myReader.close();        
        } catch (FileNotFoundException e) {
            System.out.println("error.");            
            e.printStackTrace();
        }    
    }
}
