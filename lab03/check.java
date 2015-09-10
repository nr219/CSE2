// Nicholai Redfern
// lab03
// 9/10/15
//
// Scanner
import java.util.Scanner;
//
// Class
public class check{
    // main
    public static void main(String[] args) {
        //scanner
        Scanner myScanner = new Scanner( System.in );
        // get info
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble() ;
        // tip %
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble() ;
        tipPercent /=100; //conversion to decimal
        // # of people
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt() ;
        //
            double totalCost;
            double costPerPerson;
            int dollars, dimes, pennies; //for storing digits
            totalCost = checkCost * (1 + tipPercent);
            costPerPerson = totalCost / numPeople;
            //get the whole amount, dropping decimal fraction
            dollars=(int)costPerPerson;
            //get dimes amount,
            dimes = (int)(costPerPerson * 10) % 10;
            pennies = (int)(costPerPerson * 100) % 10;
            System.out.println("Each person in the group owes $" +dollars + "." + dimes + pennies);
    }
}

