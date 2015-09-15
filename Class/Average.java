// Import 3 numbers and average them
//scanner
import java.util.Scanner;
// Class
public class Average{
    // main
    public static void main(String[] args) {
        //scanner
        Scanner myScanner = new Scanner( System.in );
        // get info 1
        System.out.print("Enter the first of the values: ");
        int one = myScanner.nextInt() ;
        // 2
        System.out.print("Enter the second of the values: ");
        int two = myScanner.nextInt() ;
        // 3
        System.out.print("Enter the third of the values: ");
        int three = myScanner.nextInt() ;
        //
        //Average
        Double average = (double) (one+two+three)/3;
        //
        //print 
        System.out.println("The average is "+average+"");
    }
}