import java.util.Scanner;

public class ej1uni{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  int[] num = new int[12];
  
  num[0] = 39;
  num[1] = -2;
  num[4] = 0;
  num[6] = 14;
  num[8] = 5;
  num[9] = 120;
  
  for (int x=0; x<num.length;x++) {
  System.out.println("num(" + x + "): " + num[x]);
  }
  
  //se definen como 0 los valores no inicializados
  
 }
}
