public class computerPi{
public static void main(String[] args){
    
        for (int i=1; i<9; i++){
            for (int y=1; y<9; y++){
                int x=0;
                x=y*i;
            System.out.print(" "+x+" ");
            }
            System.out.print("\n");
        }
}
}