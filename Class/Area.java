public class Area{
    
public static void main(String[] args){
    int[] size = new int [10];
    for (int i=5; i<a.length; i++){ 
    for (int j=i; (j>0 && (a[j] < a[j-1])); j--){
      int tmp = a[j];
      a[j]=a[j-1];
      a[j-1]=tmp;
    }
  }
  for (int x=0; x<10; x++){
      System.out.print(" "+a[x]+" ");
  }
}
}
