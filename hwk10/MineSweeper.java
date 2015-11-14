//# CSE2
// hwk10
// Nicholai Redfern
//scanner
import java.util.Scanner;
// class
public class MineSweeper{
    // methods
    public static int num(){
    //scanner
    Scanner myScanner = new Scanner( System.in );
    // get info 
    System.out.print("Enter the size of the board : ");
       int num = myScanner.nextInt();
    //
    try{
       if(num < 2 || num>30){
           throw new ArrayIndexOutOfBoundsException();
       }
    }catch( ArrayIndexOutOfBoundsException e){
      System.out.print("Number is to big or small! \n");
      System.exit(0);
    }
    return num;
}
public static int mines(int num){
     Scanner myScanner = new Scanner( System.in );
    // get info 
    System.out.print("Enter how many mines : ");
       int mines = myScanner.nextInt();
    //
    try{
       if(mines < 1 || mines>(num*num)){
           throw new ArrayIndexOutOfBoundsException();
       }
    }catch( ArrayIndexOutOfBoundsException e){
      System.out.print("Number is to big or small! \n");
      System.exit(0);
    }
    return mines;
}
            
            
// main
public static void main(String[] args){
   int num = num();
   System.out.print(" "+num+" \n");
   int mines = mines(num);
   System.out.print(" "+mines+" \n");
   char[][] board = new char[num+2][num+2];
   for (int f=0; f<num; f++){
       for (int c=0; c<num; c++){
          board[f][c] = 0;
       }
   }
   
   for (int i = 0; i <= mines;){
                int x = ((int)(Math.random())*num)+1;
                int y = ((int)(Math.random())*num)+1;
                if (board[x][y] == 'M'){ }
                else{
                board[x][y] = 'M';
                }
   for (int a = 1; a <= num; a++){
            for (int b = 1; b <= num; b++){
                // (ii, jj) indexes neighboring cells
                for (int aa = a - 1; aa <= a + 1; aa++){
                    for (int bb = b - 1; bb <= b + 1; bb++){
                        if (board[aa][bb]=='M'){
                            board[a][b]++;
                        }
                    }
                }
            }
        }
   
        for (int e = 1; e <= num; e++) {
            for (int q = 1; q <= num; q++) {
                   System.out.print(" "+board[e][q]+" "); 
            }
            System.out.print("\n");
        }

    }
}}

