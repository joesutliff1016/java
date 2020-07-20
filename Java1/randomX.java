import java.util.*;

public class randomX {
    public static void main(String[] args) {
    
    randomX();
    }
    public static void randomX() {
    Random ran = new Random();
    int j;
    
    }
    j = ran.nextInt(16) + 4;
    
    for (int i=0; i< j; i++) {
        System.out.print("x");
    }
    System.out.println();
    } while (j < 16);
    
    }
    
}