// hwk03
// 9/15/15
// Timer
//
// Scanner
import java.util.Scanner;
//
// Class
public class Timer{
    // main
    public static void main(String[] args) {
         //scanner
        Scanner myScanner = new Scanner( System.in );
        //
        //get current time
        System.out.print("Enter the current time: ");
        int currentTime = myScanner.nextInt() ;
        //
        //get dinner 
        System.out.print("Enter the time of dinner: ");
        int dinnerTime = myScanner.nextInt() ;
        //
        //calculations
        int hours = ((int)dinnerTime/100)-((int)currentTime/100);
        int min = abs(dinnerTime-currentTime)-(hours*100);
        //
        //
        System.out.println("You have "+hours+" hours and "+min+" minutes unril dinner.");
    }
}