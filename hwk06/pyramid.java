//# CSE2
// hwk06
// Nicholai Redfern
//
//scanner
import java.util.Scanner;
// class
public class pyramid{
// main
public static void main(String[] args){
    //scanner
    Scanner myScanner = new Scanner( System.in );
    // get info A
    System.out.print("What size pyramid : ");
    int num = myScanner.nextInt();
   
    for (int y=0; y<num; y++){
        
        for (int i=0; i<num-y; i++){
            System.out.print(" ");
        } 
        for (int a=0; a<=y; a++){
            System.out.print("* ");
        }
        
        System.out.print(" \n");
    }
   
}
}
