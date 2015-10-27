//# CSE2
//lab06
// Nicholai Redfern
//
//scanner
import java.util.Scanner;
// class
public class timeSheets{
// main
public static void main(String[] args){
    //scanner
    Scanner myScanner = new Scanner( System.in );
    // get info A
    System.out.print("Enter how many emplployees you have : ");
    int num = myScanner.nextInt();
   
    for (int y=0; y<num; y++){
        System.out.print("Employee "+y+" made $"+totalPay[y]+" \n");
        double total = total + totalPay[y];
    }
    System.out.print("The total was $"+total+" \n");
}
}