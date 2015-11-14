// CSE2
// lab11
// Nicholai Redfern
// class
public class array11{
// methods 
public static void sort (int[] array5){
     int a = 0;    //
     int b = 0;   //
     int t = 0;  // temp varible
     //
     while (b==0){
            b = 1;   
            for( a=0;  a < array5.length -1;  a++ ){
                   if ( array5[a] < array5[a+1] )   {
                           t = array5[ a ];             
                           array5[ a] = array5[ a+1 ];
                           array5[ a+1 ] = t;
                           b = 0;          
                  } 
            } 
      } 
}
// main
public static void main(String[] args){
   int[] array1 = new int [20];
   int[] array2 = new int [10];
   int[] array3 = new int [30];
   
   for (int i=0; i<20; i++){
       array1[i] = (int)(Math.random() * 100);
   }
   for (int i=0; i<10; i++){
       array2[i] = (int)(Math.random() * 100);
   }
   
   sort(array1);
   sort(array2);
   
   for (int i=0; i<20; i++){
       array3[i] = array1[i];
   }
   for (int x=20; x<30;x++){
       array3[x]= array2[x-20];
   }
   
   sort(array3);
   
   for (int i=0; i<30; i++){
       System.out.print(" "+array3[i]+" ");
   }
}
}