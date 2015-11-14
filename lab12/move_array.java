//# CSE2
//lab12
// Nicholai Redfern
//scanner
import java.util.Scanner;
// class
public class move_array{
// main
public static void main(String[] args){
// varibles    
    double average = 0;
    int total = 0;
    //scanner
    Scanner myScanner = new Scanner( System.in );
    // get info 
    System.out.print("Enter the size of the array : ");
       int num = myScanner.nextInt();
    //
    try{
       if(num < 1){
           throw new ArrayIndexOutOfBoundsException();
       }
    }catch( ArrayIndexOutOfBoundsException e){
      System.out.print("No Negatives or 0 allowed! \n");
      System.exit(0);
    }
    //
    int[] array1 = new int [num];
    //
    for (int i=0; i<num; i++){
       array1[i] = (int)(Math.random() * 100);
    }
    //
     for ( int i=0; i<num; i++){
           System.out.print(" "+array1[i]+" \n");
       }
     //
    System.out.print("Enter index of the number : ");
    int n = myScanner.nextInt();
    try {
       if(n<1 || n>num-1){
        throw new ArrayIndexOutOfBoundsException();   
       }
    } catch( ArrayIndexOutOfBoundsException e){
      System.out.print("Number not in index! \n");
      System.exit(0);
    }
    //
    int t = 0;
    t = array1[n];
    int y = num-1;
    for (int x=n;x<y; x++){
        array1[x] = array1[x+1];
    }
    array1[num-1] = t;
    //
    for ( int i=0; i<num; i++){
           System.out.print(" "+array1[i]+" \n");
       }
}
}