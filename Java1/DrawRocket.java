public class TwoRockets {
    public static void main(String[] args) {
        
        makeRockets();
    }
  
   
    public static void makeRockets() {
        makeDiamondTop();
        makeBox();
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        makeBox();
        makeDiamondTop();
    }
    
    public static void makeDiamondTop() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    
    public static void makeDiamondBottom() {
        System.out.println(" \\    /   \\    /");
        System.out.println("  \\  /     \\  /");
        System.out.println("   \\/       \\/");
    }
    
    public static void makeBox() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
}
