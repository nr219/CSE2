//# CSE2
// lab07
// Nicholai Redfern
//
//scanner
import java.util.Scanner;
// class
public class encrypted_x{
// main
public static void main(String[] args){
    //scanner
    Scanner myScanner = new Scanner( System.in );
    // get info starts
    System.out.print("How many Stars 1-100 : ");
    int num = myScanner.nextInt();
    
    if ((num<1)||(num>100)){
        System.exit(-1);
    }
   else
   
    for (int y=1; y<num; y++){
        for (int i=1; i<num; i++){
            if ((i==y)||(num-i==y)){
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
        }
        System.out.print("\n");
    }
}
}