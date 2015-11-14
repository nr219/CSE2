//# CSE2
//lab09
// Nicholai Redfern
//scanner
import java.util.Scanner;
import java.util.Random;
// class
public class flip{
// methods 
public static int flip(){
    int tails = 0;
    Random randomNum = new Random();
    int result = randomNum.nextInt(2);
        if (result == 0){
        tails = tails + 1;
        }
        return tails;
}
public static int flip(int num){
    int tails = 0;
     int result =0;
    for ( int i=0; i<num; i++){
        Random randomNum = new Random();
        result = randomNum.nextInt(2);
        if (result == 0){
            tails = tails + 1;
        }
    }
       return tails;
}
// main
public static void main(String[] args){
    //scanner
    Scanner myScanner = new Scanner( System.in );
    // get info 
    int a=1;
    int num=0;
    while(a==1){
    System.out.print("Enter an Integer between 0-100 : ");
    num = myScanner.nextInt();
    if ((num>=0)&&(num<=100)){
        a=0;
    }
    }
    //
    if (num == 0){
        if (flip()==0){
        System.out.print(" Tails: 1   Heads: 0  \n");
        }
        else{
        System.out.print(" Tails: 0   Heads: 1  \n");   
        }
    }
    else{
        int x = flip(num);
         System.out.print(" Tails: "+x+"  Heads: "+Math.abs(x-num)+"  \n");
        }
}
}