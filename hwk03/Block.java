// hwk03
// 9/15/15
//Block
//
// Scanner
import java.util.Scanner;
//
// Class
public class Block{
    // main
    public static void main(String[] args) {
         //scanner
        Scanner myScanner = new Scanner( System.in );
        //
        //get lenght
        System.out.print("Enter the lenght: ");
        double lenght = myScanner.nextDouble() ;
         //get width 
        System.out.print("Enter the width: ");
        double width = myScanner.nextDouble() ;
         //get height 
        System.out.print("Enter the height: ");
        double height = myScanner.nextDouble() ;
        //
        //calculations
        double volume = lenght * width * height;
        double surfaceArea = 2*(lenght*width)+2*(lenght*height)+2*(width*height);
        //
        // print
        System.out.println("The volume of a block with demisions "+lenght+" x "+width+" x "+height+" is "+volume+"");
        System.out.println("The surface area is "+surfaceArea+"");
        
    }
}