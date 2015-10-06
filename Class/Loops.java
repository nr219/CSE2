//# CSE2
// hwk06
// Nicholai Redfern
//
// class
public class Loops{
// main
double right =0;
double left =0;
public static void main(String[] args){
   for (int i =0; i<5000; i++){
        right = (double)right + (1/i);
}
   for (int i=5000; i<0; i--){
        left = (double)left + (1/i);
}
   
     System.out.print(" Right "+right+" Left "+left+" ");
}
}