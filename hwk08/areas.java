//# CSE2
// hwk08
// Nicholai Redfern
//scanner
import java.util.Scanner;
// class
public class areas{
// methods 
public static double area(int r){
    double area = 3.14*(r*r);
    return area;
} 
public static double area(int w, int l){
    double area = l * w;
    return area;
}
public static double area(int a, int b, int h){
     double area = ((a+b)/2)*h;
     return area;
}    
// main
public static void main(String[] args){
    //scanner
    Scanner myScanner = new Scanner( System.in );
    // get info 
    System.out.print("What shape? ( 1=circle, 2= rectangle, 3= trapazoid) : ");
    int num = myScanner.nextInt();
    // if
    if (num == 1){
        System.out.print("Whats the radius : ");
        int r = myScanner.nextInt();
        System.out.print("The area is : "+area(r)+" \n");
    }
    else if (num == 2){
        System.out.print("Whats the lenght : ");
        int w = myScanner.nextInt();
        System.out.print("Whats the width : ");
        int l = myScanner.nextInt();
        System.out.print("The area is : "+area(w,l)+" \n");
    }
    else if (num == 3){
        System.out.print("Whats the base a : ");
        int a = myScanner.nextInt();
        System.out.print("Whats the base b : ");
        int b = myScanner.nextInt();
        System.out.print("Whats the height : ");
        int h = myScanner.nextInt();
        System.out.print("The area is : "+area(a,b,h)+" \n");
    }
    else{
        System.out.print("Invalid Answer ");
    }
}
}
