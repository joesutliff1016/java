import java.util.*;

// Joe Sutliff
// CPW 142 
// 1/26/16
// Programming Assignment 3
//
// This program will estimate the cost of a paint job.

public class PaintJobEstimator {

    // square feet per one gallon of paint.
    public static final double AREA_PER_GALLON = 112.0; 
    
    // hours of labor needed to paint AREA_PER_GALLON square feet.
    public static final double HOURS_PER_UNIT_AREA = 8.0;
    
    // charge to customer for one hour of labor.
    public static final double LABOR_COST_PER_HOUR = 35.0;

   
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner( System.in );
        
        
        
        
        double sqft = getInput( keyboard, 
                       "Enter the number of square feet: ");


        // How much does a gallon of paint cost?
        
        double gallonCost = getInput( keyboard, 
                       "Enter the price of a gallon of paint: ");
        
        System.out.println("To paint " + sqft + " square feet, with");
        
        System.out.println("paint that costs " + gallonCost + " per gallon,");               
      
 
        
        // How many gallons of paint will you need?            
        int numGallons = calculateGallons( sqft );
        System.out.println("you will need "+ numGallons +" gallons of paint");
        
        // How long will the job take?
        double hoursLabor = calculateHours( sqft );
        System.out.println("and " + hoursLabor + " hours of labor.");
        
        // How much will the paint cost?
        double paintCost = calculatePaintCost( numGallons,
                                               gallonCost ); 
        System.out.println("The cost of the paint is: " + paintCost);                                       
        
        // How much will the labor cost?
        double laborCost = calculateLaborCost( hoursLabor );
        System.out.println("The cost of the labor is: " + laborCost);
        
        // What's the total bill?
        double totalCost = calculateTotalCost( paintCost,
                                                laborCost ); 
        System.out.println("The total cost of the job is: " + totalCost);                                       
        
                           
        
    }
    
    public static double getInput( Scanner input, String prompt ) {
        System.out.print( prompt );
        while ( !input.hasNextDouble() ) {
            input.nextLine(); // get rid of bad input.
            System.out.print( prompt );
        }
        double inValue = input.nextDouble();
        input.nextLine(); // clear the input line.
        return inValue;
    }
    
    
    // calculateGallons
    public static int calculateGallons( double sqft ) {
        return (int)Math.ceil(sqft / AREA_PER_GALLON);
        
    } 
    
    // calculateHours
    public static double calculateHours( double sqft ) {
        return (double)Math.round(100*sqft / AREA_PER_GALLON * HOURS_PER_UNIT_AREA)/100;  
        
    }
    // calculatePaintCost
    public static double calculatePaintCost( int numGallons,
                                          double gallonCost ) {
        return numGallons * gallonCost;
    }
    // calculate laborCost
    public static double calculateLaborCost( double hoursOfLabor ) {
        return (int)Math.round(hoursOfLabor * LABOR_COST_PER_HOUR); 
    
    }
    // calculateTotalCost
    public static double calculateTotalCost( double LaborCost,
                                             double PaintCost) {
        return (double)Math.round(LaborCost + PaintCost);
    }
    
         
}