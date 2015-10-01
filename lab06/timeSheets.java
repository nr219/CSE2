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
    //
    int[] pay = new int[num];
    int hours = 0;
    double[] totalPay = new double[num];
    //
    for (int i=0; i<num; i++){
        System.out.print("Enter how much this person is payed in cents : ");
        pay[i] = myScanner.nextInt();
        //
        for (int x=1; x<6; x++){
            System.out.print("Enter how many hours they worked on the "+x+" day : ");
            hours = hours + myScanner.nextInt(); 
        }
        totalPay[i] = (double)(pay[i]*hours)/100;
        hours = 0;
    }
    for (int y=0; y<num; y++){
        System.out.print("Employee "+y+" made $"+totalPay[y]+" \n");
        double total = total + totalPay[y];
    }
    System.out.print("The total was $"+total+" \n");
}
}