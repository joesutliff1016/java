public class Circle implements Shape{
     private Point center;
     private int radius;
    
    public Circle(){
        
    }
    
    public Circle(Point center, int radius ){
        this.radius = radius;
        this.center = center;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
        
    }
    
    public double getPerimeter(){
        return 2.0 * Math.PI * radius;
    }
    
    public String toString(){
        return "{" + center.toString() + "," + " " + radius + "}";
    }
        
    public boolean equals( Object other ) {
        if ( other.equals(radius) ) {
            return true;
        }
        else{
            return false;
        }
    }
}
 
        
      
     