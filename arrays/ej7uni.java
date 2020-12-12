import java.util.Scanner;

public class ej7uni{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  int[] num = new int[100];
  int i;
  int x=0;

  

  for(i=0;i<100;i++){
   num[i]=(int)(Math.random()*21);
   System.out.print(num[i] + " ");
  }
  
  System.out.print("\nintroduzca un número de los mostrados: ");
  int cambio1= s.nextInt();
  System.out.print("introduzca por cual valor cambiarlo: ");
  int cambio2= s.nextInt();
  System.out.println();
  
  
  for (i = 0; i < 100; i++) {
    if (num[i] == cambio1) {
    num[i] = cambio2;
    System.out.print("\"" + num[i] + "\" ");
    } else {
      System.out.print(num[i] + " ");
      }
    } 
  

}
}
