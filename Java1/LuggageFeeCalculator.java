// Joe Sutliff
// CPW 142
// 2/12/16
//
// This program calculates luggage fees.
import java.util.*;

public class LuggageFeeCalculator {

    public static final double WEIGHT_ALLOWANCE = 50.0;
    public static final double SIZE_ALLOWANCE = 62.0;
    

    public static void main( String[] args ) {
     
      
        Scanner console = new Scanner( System.in );
 
         
        System.out.print("Weight of first item: ");
        double weightOne = console.nextDouble();
        System.out.print("Length of first item: ");
        double lengthOne = console.nextDouble();
        System.out.print("Width of first item: ");
        double widthOne = console.nextDouble();
        System.out.print("Height of first item: ");
        double heightOne = console.nextDouble();
        
        // get info for second bag
        System.out.print("Weight of second item: ");
        double weightTwo = console.nextDouble();
        System.out.print("Length of second item: ");
        double lengthTwo = console.nextDouble();
        System.out.print("Width of second item: ");
        double widthTwo = console.nextDouble();
        System.out.print("Height of second item: ");
        double heightTwo = console.nextDouble();
    
        
        // potential overages
        // note that these values may be negative,
        // if an excess is not positive,
        // there should be no extra charge.
        double excessWeight = weightOne + weightTwo 
                            - WEIGHT_ALLOWANCE;
 
        double excessSizeOne = lengthOne + widthOne + heightOne - SIZE_ALLOWANCE;
       
        double excessSizeTwo = lengthTwo + widthTwo + heightTwo - SIZE_ALLOWANCE;
        
        double totalAmount = excessWeight * 2;
        
      
        if (weightOne + weightTwo > WEIGHT_ALLOWANCE) {
         System.out.println("Your luggage is overweight by " + (weightOne + weightTwo - WEIGHT_ALLOWANCE) + " lbs.");
           }else if( (weightOne + weightTwo - WEIGHT_ALLOWANCE) <= WEIGHT_ALLOWANCE) {
         System.out.println("Your luggage is not overweight.");
        
        
        }
        if (lengthOne + widthOne + heightOne > SIZE_ALLOWANCE) {
         System.out.println("Your first piece of luggage is oversize by " + (lengthOne + widthOne + heightOne - SIZE_ALLOWANCE)  + " inches.");
         totalAmount = totalAmount + 5;
         
           }else if( (lengthOne + widthOne + heightOne) <= SIZE_ALLOWANCE) { 
         System.out.println("Your first piece of luggage is not oversize.");
       
                   
   
        }
        if ( lengthTwo + widthTwo + heightTwo > SIZE_ALLOWANCE) {
         System.out.println("Your second piece of luggage is oversize by " + (lengthTwo + widthTwo + heightTwo - SIZE_ALLOWANCE) + " inches.");
         totalAmount = totalAmount + 5;
         System.out.println("Total luggage charge is " + totalAmount + "0.");
        }else if ( (lengthTwo + widthTwo + heightTwo) <= SIZE_ALLOWANCE) {
            System.out.println("Your second piece of luggage is not oversize.");
        }
        if ( totalAmount < 0) {
            System.out.println("Total luggage charge is 0.00.");
            
        
        }
    }
}
        
            
       
 
 

            
      
 
     
            
    

        
    

         
 
  
            
   
       

      
           



    

 
   
   
   
   
   

       
 

        
    

        
    
   
    
        
      
    

        

      
    