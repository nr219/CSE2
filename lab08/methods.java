// CSE2
// lab08
// Nicholai Redfern
//
//scanner
import java.util.Scanner;
//methods
// class
public class methods{
public static int scan1(int n){
    //scanner
    Scanner myScanner = new Scanner( System.in );
    // get info starts
    System.out.print("How many numbers : ");
    n = myScanner.nextInt();
    return n;
}
public static int[] scan2(int n){
    int[] numbers = new int [n];
    Scanner myScanner = new Scanner( System.in );
        for (int m=1; m<n; m++){
    System.out.print("What is your "+m+" number : ");
    numbers[m] = myScanner.nextInt();
    }
    int t =0;
    for(int i = 0;i<n; i++){
            for(int j = 1; j<n-i; j++){
                if(numbers[j-1] > numbers[j])
                {
                    t = numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=t;
                }
            }
        }
    return numbers;
}
public static int total(int n, int[] numbers, int t){
    for (int i=0; i<n; i++){
    t = t + numbers[i];
    }
    return t;
}
public static double mean(int n, int t){
    double mean = t/n;
    return mean;
}
public static double median(int n, int[] numbers){
    double median;
    if (n%2==0){
        int a = n/2;
        int b = n/2+1;
        median = (numbers[a]+numbers[b])/2;
    }
    else{
        int i= (n+1/2);
        median = numbers[i];
    }
    return median;
}
public static void print(double median, double mean){
    System.out.print("Mean = "+mean+"\n");
    System.out.print("Median = "+median+"\n");
}
// main
public static void main(String[] args){
    int n=0;
    int t=0;
    
    n = scan1(n);
    int[] numbers = scan2(n);
    t = total(n, numbers, t);
    print( median(n,numbers), mean(n, t) ); 
    
}
}