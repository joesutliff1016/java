import java.awt.*;

// Joe Sutliff
// CPW 142 Winter 2016
// Programming Exercise 6
// This program will bounce a ball and leave a ball tracer behind its path.

public class BouncingBall {
    // width of drawing panel.
    public static final int WIDTH = 300;
    
    // height of drawing panel.
    public static final int HEIGHT = 200; 
    
    // scale the ball to the size of the window.
    public static final int BALL_SIZE = Math.min( WIDTH, HEIGHT ) / 10;
    
    // how long to wait between steps in animation.
    public static final int TIME_UNIT = 50;
    
    // how many steps the ball will take
    // note: if width = 300 and height = 200,
    // it takes 504 steps to complete an entire 
    // circuit of the panel.
    public static final int NUM_STEPS = 504;// 504;

    public static void main( String[] args ) {
        DrawingPanel panel = new DrawingPanel( WIDTH, HEIGHT );
        Graphics g = panel.getGraphics();
        
        bounceTheBall( panel, g );
    }
    
    public static void bounceTheBall( DrawingPanel panel, Graphics g ) {
        // ball moves half its diameter on each step.        
        int deltaX = BALL_SIZE / 2;
        int deltaY = BALL_SIZE / 2;
        
        // ball begins in upper left corner.
        int x = 0;
        int y = 0;
        
        for ( int i = 0; i < NUM_STEPS; i++ ) {
           
            // draw a ball
            g.fillOval( x, y, BALL_SIZE, BALL_SIZE );
            // wait some milliseconds            
            panel.sleep( TIME_UNIT );
            // leave a ghost of the ball.
            g.setColor( Color.BLUE );
            g.fillOval( x, y, BALL_SIZE, BALL_SIZE );
            
            // get ready to draw next ball.
            g.setColor( Color.RED );
            x += deltaX;
            y += deltaY;
            
        // changes the direction of the ball if it touches the edge.
        
        if ( x <= 0 ) {
            deltaX *= -1;
        }
        if ( y <= 0 ) {
            deltaY *= -1;
        }
        if ( y + BALL_SIZE > HEIGHT - 1) {
            deltaY *= -1;
        }
        if ( x + BALL_SIZE > WIDTH - 1) {
            deltaX *= -1;
        }
       

        
        // draw one last ball at stopping location.
        g.fillOval( x, y, BALL_SIZE, BALL_SIZE );
        
        }
    }
}