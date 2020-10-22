import java.util.Scanner;

public class concatenacion {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
 
 int x = 0;
 String cadena="los numeros son ";
 double media=0;
 System.out.print("indique cuantos numeros son ");
 int y = s.nextInt();
 
 for (int a=0; a<y;a++) {
   System.out.print("indique 1 número ");
   
   x = s.nextInt();
   
   cadena += x + "-";
   
   media += x;
   
 }
 media = (double)media/y;
 
 System.out.println(cadena);
 System.out.print("la media es: " + media);
 
 }
}
