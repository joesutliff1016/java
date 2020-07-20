import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Source {

/**
* @param args
* @throws FileNotFoundException 
*/
public static void main(String[] args) throws FileNotFoundException {
//read file
Scanner s = new Scanner(new FileReader("5 7 2 8 9 10 12 98 7 14 20 22"));
//call evennumbers function
evenNumbers(s);
}
public static void evenNumbers(Scanner s)
{
int numOfNumbers = 0;
int numOfEvens = 0;
int sum = 0;

//while we have a next int
while(s.hasNextInt())
{
//get the next int
int num = s.nextInt();
numOfNumbers++;
sum += num;
//check if even by using mod operator. Returns the remainder so if it goes into 2 without a remainder
//its even
if(num % 2 == 0)
{
numOfEvens++;
}
}
double percentOfEvents = ((double)numOfEvens / (double)numOfNumbers) * 100.0;
System.out.println(numOfNumbers + " numbers, sum = " + sum);
//String.format() code rounds the double to 2 decimal places
System.out.println(numOfEvens + " evens ("+String.format("%.2f", percentOfEvents)+"%)");
}

}