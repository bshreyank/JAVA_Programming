package File_Handeling;

import java.io.File;  // Import the File class
public class files4 {
    public static void main(String[] args) {        
        File myObj = new File("test.txt");
        if (myObj.delete()) {            
            System.out.println("File Deleted: " + myObj.getName());
        } else {            
            System.out.println("Unable to delete");
        }    
    }
}
