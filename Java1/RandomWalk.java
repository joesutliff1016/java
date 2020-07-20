import java.awt.*;
import java.util.*;

// Joe Sutliff
// CPW 142 Winter 2016
// Programming Exercise 7
// This program will make a random design!

public class RandomWalk {

    // DrawingPanel will have dimensions DIM by DIM
    public static final int DIM = 400;
    
    // Start the random walk in the center of the screen
    public static final int CENTER = DIM / 2;
    
    // how big should the cursor appear?
    public static final int CURSOR_DIM = 10;
    
    // how long should the cursor saty in one place?
    public static final int SLEEP_TIME = 30; // milliseconds

    public static void main( String[] args ) {
        DrawingPanel panel = new DrawingPanel( DIM, DIM );
        
        Random rand = new Random();
        
        walkRandomly( panel, rand );
    }
    
    /**
     * Draw a random walk on the panel.
     * Stop as soon as you walk off the panel.
     * Each random step should go only in one
     * of these directions: left, right, up, down.
     * @param panel a DrawingPanel to draw the
     *        random walk on
     * @param rand a Java Random object to be
     *        used to generate random steps
     */
    public static void walkRandomly( DrawingPanel panel, Random rand ) {
        Graphics g = panel.getGraphics();
        
        // start in center of panel
        int x = CENTER;
        int y = CENTER;
       
        // Randomly step left, right, up, or down
        // until cursor goes off screen.
        while ( onScreen( x, y ) ) {
           
        
            // Draw the cursor in BLACK
            g.fillRect(x, y, CURSOR_DIM, CURSOR_DIM);
            // Wait a bit.
            panel.sleep( SLEEP_TIME );
            // Show a shadow version of the cursor
            g.setColor(Color.GRAY);
            g.fillRect(x, y, CURSOR_DIM, CURSOR_DIM);
            
            // YOUR CODE GOES BETWEEN THE STARS
            // Choose a new location for the cursor
            //*********************************
      
            double r = Math.random();
            
            if       (r < 0.25) { 
                x += CURSOR_DIM;
                
            }else if (r < 0.50) { 
                x -= CURSOR_DIM;
                
            }else if (r < 0.75) {
                y += CURSOR_DIM;
                
            }else if (r < 1.00) {
                y -= CURSOR_DIM;
            }
   
            //*********************************
            // END OF YOUR CODE 
            
            // draw the cursor at its new location
            g.setColor(Color.BLACK);
            g.fillRect(x, y, CURSOR_DIM, CURSOR_DIM);
        }
    }
    
    /**
     * determine whether (x, y) is a point on the panel.
     * @param x the x-coord of the cursor
     * @param y the y-coord of the cursor
     * @return true if (x,y) is on the screen,
     *         false if (x,y) is off the screen
     */
    public static boolean onScreen( int x, int y ) {
        // YOUR CODE GOES BETWEEN THE STARS
        // Replace "return true" with code
        // that returns true if (x,y) is still
        // on the screen and returns false if
        // (x,y) is no longer on the screen.
        //*********************************
   
        if ( x < 0 || y < 0 || x > DIM || y > DIM) {
        return false;
        
        }else {  
        return true;
        }
    }
    
    

        //*********************************
        // END OF YOUR CODE
    public static int[] positionCounts(int x) { 
        int[] positionCounts = new int[ WIDTH / CURSOR_DIM ];
        while( x > CURSOR_DIM ) {
            positionCounts[ x / CURSOR_DIM ]++;
            
            
            System.out.println(positionCounts);
        }
    }
}
      

 
