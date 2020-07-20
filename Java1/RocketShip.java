//Joe Sutliff
//1/22/16
//CPW 142
//Assignment #2
//
//This program will make a RocketShip design that can change sizes.

public class RocketShip {
    public static final int ROCKET_SIZE = 2;
    
    public static void main( String[] args ) {
        printNoseCone();
        printBody();
        printNoseCone();
        
    }

    /**
      Prints the NoseCone of the Rocket.
     */
    public static void printNoseCone() {
        for( int line = 1; line <= 2 * ROCKET_SIZE - 1; line++ ) { 
             for( int i = 1; i <= -1 * line + 2 * ROCKET_SIZE; i++ ) {
             System.out.print( " " );
         }
         for( int i = 1; i <= 1 * line; i++ ) {
            System.out.print("/");
         }
         for( int i = 1; i <= 0 * line + 2; i++ ) {
             System.out.print("*");
        
         }
 
         for( int i = 1; i <= 1 * line; i++ ) {
             System.out.print("\\");
        
         }
         
         System.out.println();    
             
         }
        
    }
    
    /**
      Prints the body of rocket. This is a two-stage pattern
      with a diamond pattern in the top half and an
      hour glass on the bottom.
     */
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();
        printEdge();        
    }
    
    /**
     Prints the top half of two diamonds between vertical lines.
     */
    public static void printDiamondTop() {
        for( int line = 1; line <= ROCKET_SIZE; line++ ) {
             System.out.print( "|" );
            for( int i = 1; i <= -1 * line + ROCKET_SIZE; i++ ) {
                 System.out.print( "." );
            }
            for( int i = 1; i <= 1 * line; i++ ) {
            System.out.print( "/\\" );
            }
            for( int i = 1; i <= -2 * line + 2 * ROCKET_SIZE; i++ ) {
            System.out.print( "." );
            }
            for( int i = 1; i <= 1 * line; i++ ) {
            System.out.print( "/\\" );
            }
            for( int i = 1; i <= -1 * line + ROCKET_SIZE; i++ ) {
             System.out.print( "." );
             
            }
            
            System.out.println("|");
         }
    }
    
    /**
     Prints the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        for( int line = 1; line <= ROCKET_SIZE; line++ ) { 
             for( int i = 1; i <= 0 * line + 1; i++ ) {
                   System.out.print( "|" );
       
        }
        for( int i = 1; i <= 1 * line - 1; i++ ) {
             System.out.print( "." );
        }
        for( int i = 1; i <= -1 * line + ROCKET_SIZE + 1; i++ ) {
            System.out.print( "\\/" );
        }
        for( int i = 1; i <= 2 * line - 2; i++ ) {
             System.out.print( "." );
        }
        for( int i = 1; i <= -1 * line + ROCKET_SIZE + 1; i++ ) {
            System.out.print( "\\/" );
        }
        for( int i = 1; i <= 1 * line - 1; i++ ) {
             System.out.print( "." );
     
        }
        
        System.out.println("|");
        
        } 
       
             
    }
   
    
    /**
      Prints the +=*=*=*=+ design to fit the width of the rocket.
     */
      public static void printEdge() {
        System.out.print( "+" );
        for( int i = 1; i < 2 * ROCKET_SIZE + 1; i++ ) {
           
            System.out.print( "=*" );
        }
        
        System.out.println( "+" );
        
     
    }
}










 


