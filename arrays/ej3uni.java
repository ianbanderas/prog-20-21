import java.util.Scanner;

public class ej3uni{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  int[] num = new int[10];
  
  for(int x=0;x<10;x++){
    System.out.print("indique un numero: ");
    num[x] = s.nextInt();
  }
  for(int x=9;x>=0;x--){
    System.out.println("num(" + x + "): " + num[x]);
  }
  
 }
}
