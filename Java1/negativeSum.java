import java.util.*;

public class negativeSum {
    public static void main(String[] args) {
        Scanner inputOne = new Scanner("38 4 19 -27 -15 -3 4 19 38");
        Scanner inputTwo = new Scanner("14 7 -10 9 -18 -8 17 42 98");
        checkNegativeSum(inputOne);
        System.out.println();
        checkNegativeSum(inputTwo);
    }
    
    public static void checkNegativeSum(Scanner input) {
        int sum = 0;
        boolean found = false;
        int count = 0;
        while (input.hasNextInt()&& !found ) {
            int next = input.nextInt();
            count++;
            sum += next;
            if (sum < 0) {
                found = true;
                
            }
        }
        if (found) {
            System.out.println("Negative sum after " + count + " steps.");
            System.out.println("sum = " + sum);
        }else {
           System.out.println("no negative sum");
        
        }
        
    }
    
}
 
    
    