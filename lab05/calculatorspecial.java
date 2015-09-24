//
// Nicholai Redfern
// lab04
// 9/17/15
//
//scanner
import java.util.Scanner;
// class
public class calculatorspecial{
// main
public static void main(String[] args){
    //while
    char stop ='y';
    while (stop !='n' && stop !='N'){
    //scanner
    Scanner myScanner = new Scanner( System.in );
    Scanner reader = new Scanner(System.in);
        // get info A
        System.out.print("Enter an integer for A: ");
        int A = myScanner.nextInt() ;
        // get info B
        System.out.print("Enter an integer for B: ");
        int B = myScanner.nextInt() ;
        // sign
        System.out.print("Enter your sign as an integer ( +=1 ,-=2, *=3, /=4 ): ");
        int sign = myScanner.nextInt() ;
        //
        //switch
        double ans =0;
        switch (sign) {
            case 1: ans = A+B;
                System.out.print("  "+A+" + "+B+" = "+ans+" \n");
                break;
            case 2: ans = A-B;
                System.out.print("  "+A+" - "+B+" = "+ans+" \n");
                break;
            case 3: ans = A*B;
                System.out.print("  "+A+" * "+B+" = "+ans+" \n");
                break;
            case 4: ans = A / B;
                System.out.print("  "+A+" / "+B+" = "+ans+" \n");
                break;
            default: System.out.print(" Invalid Operator");
        }
        // get info stop
        System.out.print("Enter n or N to stop: ");
        stop = reader.findInLine(".").charAt(0);
}
}
}
        
        