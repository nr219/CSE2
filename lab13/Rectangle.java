//# CSE2
// lab13
// Nicholai Redfern
//scanner
import java.util.Scanner;
// class
public class Rectangle{
// varibles
    double width = 0;
    double height = 0;
// methods
    public void setWidth(double x){ 
        width = x;
    }
    public void setHeight(double y){ 
        height = y;
    }
    public double getArea(){
        double area = 0;
        area = width*height;
        return area;
    }
 
// main
public static void main(String[] args){
    Rectangle r1 = new Rectangle();
    
    r1.setHeight(5.3);
    r1.setWidth(7.3);
    
    System.out.println(""+r1.getArea()+" ");
    
}
}