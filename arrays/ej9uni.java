import java.util.Scanner;

public class ej9uni{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  int num[] = new int[8];
  System.out.print("introduzca 8 numeros");
  
  for (int i = 0; i < 8; i++) {
  num[i] = s.nextInt();
  }  
  
  for (int i = 0; i < 8; i++) {
    if (num[i] % 2 == 0) {
    System.out.println(num[i] + " es par");
    } else {
    System.out.println(num[i] + " es impar");
    }
  }
 }
}
