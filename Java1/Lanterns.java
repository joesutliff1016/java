public class Lanterns 
{
    public static void main( String[] args ) { 
        
        makeTop();
        makeSpaces();
        makeTop();
        makeStarsBars();
        make13Stars();
        makeTop();
        makeSpaces();
        makeTop();
        make5Stars();
        makeStarsBars();
        makeStarsBars();
        make5Stars();
        make5Stars();
    }
    
    public static void makeTop() {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    
    public static void makeSpaces() {
        System.out.println();
    }
    
    public static void makeStarsBars() {
        System.out.println("* | | | | | *");
    }
    
    public static void make5Stars() {
        System.out.println("    *****    ");
    }
    
    public static void make13Stars() {
        System.out.println("*************");
            
    }
}