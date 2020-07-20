// Joe Sutliff
// CPW 142
// 3/11/16
//
//This program calculates which lockers are open.

public class LockerFun {
    public static void main(String[] args) {
        boolean[] list = new boolean[101];
        
        for( int i = 1; i < list.length; i++ ) 
            list[i] = true;
        
        for( int i = 2; i < list.length; i += 2 ) 
            list[i] = false;
        
        for( int i = 3; i < list.length; i++ ) {
            for( int j = 1; j < list.length; j++ ) {
                if( j % i == 0 )
                 
                list[j] = !list[j];
        }
    }    
            System.out.print("Open lockers: ");       
            
        for( int i = 1; i < list.length; i++ ) {
            if( list[i] == true )
                System.out.print( i + "," + " " );
               
            
        }
    }
}
        
   
    
      



    



           

 
        