/*
  Joe Sutliff
  Solves CPW 143 homework assignment 3
  This program plots a triangle in the graphics 
  system and uses methods to return information
  about the triangle. 
*/

public class Triangle {

    private Point p1;  // a triangle
    private Point p2;  // has three
    private Point p3;  // corners.
    
    
    
    
    // no arg constructor
    public Triangle(){
        this(new Point(0,0), new Point(1,1), new Point(2,5)); 
       
       
    }
    
    // general constructor
    
    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        
    }
   

    // getArea
    public double getArea(){
    
        double a = p1.distance (p2);
        double b = p2.distance (p3);
        double c = p3.distance (p1);
        
        double s = (a + b + c)/2.0d;
        double x = (s * (s-a) * (s-b) * (s-c));
        double Area = Math.sqrt(x);
        return Area;
       
       
       
        
        


    }   
    
    
    
    
    // getPerimeter
    public double getPerimeter(){
        return p1.distance (p2) + p2.distance (p3) + p3.distance (p1);
    }
    
    // contains
    public boolean contains( Triangle t ){
        return contains(t.p1)
            && contains(t.p2)
            && contains(t.p3);
    }
    
    
    // toString
    public String toString(){
        return " Triangle: p1 = " + p1 + " p2 = " + p2
               + " p3 = " + p3;

    }
    
    
    /**
     * Determine if this Triangle contains the Point p
     * @return true if p is in this Triangle, false otherwise.
     */
    public boolean contains( Point p ) {
        boolean b1 = sign(p, p1, p2) < 0.0;
        boolean b2 = sign(p, p2, p3) < 0.0;
        boolean b3 = sign(p, p3, p1) < 0.0;

        return ( ( b1 == b2 ) && ( b2 == b3 ) );
    }
    
    /**
     * @return positive value if p is on the right of 
     *         line segment from p1 to p2, zero if on
     *         line segment, positive otherwise.
     */
    private float sign( Point p1,  Point p2,  Point p3 ) {
        return ( p1.getX() - p3.getX() ) * ( p2.getY() - p3.getY() ) 
             - ( p2.getX() - p3.getX() ) * ( p1.getY() - p3.getY() );
    }
    
    /**
     * standard equals method required by Java convention
     * @return true if other is a trianle with the same
     *         corners as this, false otherwise.
     */
    public boolean equals( Object other ) {
        if ( other == null ) {
            return false;
        }
        
        // consider all combinations of ways to 
        // match up points of the two triangles.
        if ( other instanceof Triangle ) {
            Triangle line = (Triangle) other;
            
                   // other: p1 p2 p3
                   // this:  p1 p2 p3
            return line.p1.equals( p1 ) 
                   && line.p2.equals( p2 ) 
                   && line.p3.equals( p3 )
                   
                   // other: p1 p2 p3
                   // this:  p1 p3 p2
                || line.p1.equals( p1 ) 
                   && line.p2.equals( p3 ) 
                   && line.p3.equals( p2 )
                   
                   // other: p1 p2 p3
                   // this:  p2 p1 p3
                || line.p1.equals( p2 ) 
                   && line.p2.equals( p1 ) 
                   && line.p3.equals( p3 )
                   
                   // other: p1 p2 p3
                   // this:  p2 p3 p1
                || line.p1.equals( p2 ) 
                   && line.p2.equals( p3 ) 
                   && line.p3.equals( p1 )
                   
                   // other: p1 p2 p3
                   // this:  p3 p1 p2
                || line.p1.equals( p3 ) 
                   && line.p2.equals( p1 ) 
                   && line.p3.equals( p2 )
                   
                   // other: p1 p2 p3
                   // this:  p3 p2 p1
                || line.p1.equals( p3 ) 
                   && line.p2.equals( p2 ) 
                   && line.p3.equals( p1 );
        }
        return false;
    }
}