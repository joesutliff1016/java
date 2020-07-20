// Joe Sutliff
// CPW 142
// 2/4/16
//
// This program draws circles in squares.
import java.awt.*;

public class SquaredCircles {
    
    public static void main( String[] args ) {
        DrawingPanel panel = new DrawingPanel(400, 400);
        Graphics g = panel.getGraphics();
        
        panel.setBackground( Color.CYAN );
 
        drawSquaredCircles( g, 0, 0, 100, 5, 1 );
        drawSquaredCircles( g, 10,  120, 24,  4, 5 );
        drawSquaredCircles( g, 150, 20,  40,  5, 6 );
        drawSquaredCircles( g, 130, 275, 36,  3, 3 );
        
        
        
    }
    
    // Draws a square figure, at the given x/y position.
    public static void drawSquaredCircles( Graphics g, int x, int y,
                                           int subfigureSize, 
                                           int numCircles, 
                                           int numRowsCols ) {
    
         drawCircles(g, x , y, subfigureSize, numCircles);
         for(int i = 0; i < numRowsCols; i++){
             for(int j = 0; j < numRowsCols; j++){
         drawCircles(g, x + subfigureSize * i 
                      ,y + subfigureSize * j
                      ,subfigureSize, numCircles);
        } 
       
        
    }
}        
    
     
    // draws one squared circle figure
    public static void drawCircles( Graphics g, int x, int y, 
                                    int width, int numCircles ) {   
        // draw square background
        g.setColor( Color.GREEN );
        g.fillRect( x, y, width, width );
        
        // draw circle background
        g.setColor( Color.YELLOW );
        g.fillOval( x, y, width, width );
        
        // draw circles from outside to inside
        g.setColor( Color.BLACK );
        for ( int circle = 0; circle < numCircles; circle++ ) {
            int inSetWidth = width * circle / numCircles; // width of inscribed circle.
            g.drawOval( x + inSetWidth / 2, // left corner is inset 1/2 the width
                        y + inSetWidth / 2, // left corner is inset 1/2 the width
                        width - inSetWidth, // inset circle width
                        width - inSetWidth );  // inset circle height
        }
        
        // box it in
        g.drawRect( x, y, width, width );
        
        // horizontal line through the middle                
        g.drawLine( x, 
                    y + width / 2, 
                    x + width,
                    y + width / 2 );
                            
        // vertical line through the middle             
        g.drawLine( x + width / 2, 
                    y, 
                    x + width / 2,
                    y + width );
    }
}