//# CSE2
// hwk06
// Nicholai Redfern
//
//scanner
import java.util.Scanner;
// class
public class averageGrade{
// main
public static void main(String[] args){
    //scanner
    Scanner myScanner = new Scanner( System.in );
    //
    int i=0;
    // total
    int total =0;
    int grade = 0;
    int b = 0;
    while ( i!=1 ){
        System.out.print("Grade : ");
        grade = myScanner.nextInt();
        //
        if (grade==999){
            i = 1;
        }
        else if ((grade<0)||(grade>100)){
          System.out.print("Invalid Entry \n");
        }
        else { 
            total = total+(grade);
            b++;
        }
        
    }
    // average
     double averge = (double)(total/b);
     System.out.print("The averge was "+averge+" \n");
}
}