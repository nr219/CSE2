//# CSE2
//lab10
// Nicholai Redfern
//scanner
import java.util.Scanner;
// class
public class arrays{
// main
public static void main(String[] args){
    
    double average = 0;
    int total = 0;
    //scanner
    Scanner myScanner = new Scanner( System.in );
    // get info 
    System.out.print("Enter an Integer : ");
    int num = myScanner.nextInt();
    int[] size = new int [num];
    //
    for ( int i=0; i<num; i++){
        size[i] = (int)(Math.random() * 100);
    }
    for ( int i=0; i<num; i++){
        System.out.print("  "+size[i]+"  \n");
    }
    for ( int i=0; i<num; i++){
       total = total + size[i];
    }
    average = total/num;
    System.out.print(" Sum: "+total+"  Average: "+average+"  \n");
    System.out.print(" Numbers greater than or equal to average: \n");
    for ( int i=0; i<num; i++){
       if (size[i] >= average){
           System.out.print(" "+size[i]+" \n");
       }
    }
}
}