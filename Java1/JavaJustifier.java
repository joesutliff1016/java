import java.util.*; // Scanner
import java.io.*; // File
/**
 * File: JavaJustifier
 *
 * Author of Starter Code: Ken Meerdink
 * Author of justifyJava: Joe Sutliff
 * 
 * Version: Winter 2016 CPW 142
 *
 * This program reads a file and formats it
 * according to Java standards for indenting.
 *
 */
public class JavaJustifier {
    public static void main( String[] args ) 
               throws FileNotFoundException {
    
        final int TAB_SIZE = 4; // sets the level of indent
        
        for( int i = 1; i < 4; i++ ) {
            justifyJava( "Test" + i + ".java", 
                         "Justified" + i + ".txt", 
                         TAB_SIZE );
            String reference = new Scanner(new File("JustifiedReference" + i + ".txt"))
                              .useDelimiter("\\Z").next();
            String justified = new Scanner(new File("Justified" + i + ".txt"))
                              .useDelimiter("\\Z").next();
            if ( reference.equals( justified ) ) {
                System.out.print( "Success " );
            }
            else {
                System.out.print( "Failure " );
            }
            System.out.println( "for Test" + i + ".java" );
            System.out.println();
        }              
    }
   
    /**
     * This method takes a java file with a balanced set of open and 
     * close curly braces, { and }, and formats the file to have a proper
     * indentation of code.
     *
     * @param inputFileName the name of the file to be processed
     * @param outputFileName the name of the file that results
     * @param tabSize the number of spaces for a level of indent
     *
     */
    public static void justifyJava( String inputFileName, String outputFileName, int tabSize ) 
        throws FileNotFoundException {
               
        // your code goes here.
     
        String one_tab = "";
        
        for ( int i = 0; i < tabSize; i++ ) {
            one_tab += " ";
        }
            
            Scanner inFile = new Scanner(new File(inputFileName));
        
            PrintStream outFile = new PrintStream(new File(outputFileName));
        
            String currentTab = "";
        
        
        while (inFile.hasNext()) {
            String currentLine = inFile.nextLine().trim();
            
        
        if (currentLine.contains("}")) {
            currentTab = currentTab.substring (0, currentTab.length() - tabSize);
        }
            
            currentLine = currentTab + currentLine;
        
            System.out.println(currentLine);
            
            outFile.println(currentLine);
        
        
        if(currentLine.contains("{")) {
            currentTab += one_tab;
        }
        
        }
    }
}
