package PersuiteOfHappiness;

public class RubiksCube {
    
    public static void main (String[] args){
        
        //3 - Cab Fare - Chris has 18$ in his pocket. 
            //Every 1 km fare raises by 3$. One iteration of a for loop is 1 KM in your case.
            //Try to make the code for above scenario. 
            //If fare goes above 18$ that means chris needs to stop the driver.
          
        int fare = 0;

        for(int i=0;true;i++){
            
            if(fare >= 18){
                System.out.println("Please stop the cab, and fare = "+fare + " and distance is - "+i);
                break;
            }
            fare = fare + 3;
        }


    }
}
