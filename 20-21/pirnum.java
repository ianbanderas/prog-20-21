import java.util.Scanner;

public class pirnum {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("Diga un número y hasta que número quiere llegar ");
  int y = s.nextInt();
  int z = s.nextInt();
  
  String cadena="";
  for (int x=0;x<z;x++){
   
   cadena+=y + " ";
   System.out.println(cadena);
   y++;
   
  }
  
  System.out.print("Diga un número y hasta que número quiere llegar ");
  int a = s.nextInt(); //numero que comienza
  int b = s.nextInt(); //numero de filas
  String cadena2="";
  
   for (int x=0;x<b;x++){
   
   cadena2+=a + " ";
   System.out.println(cadena2);
   a++;
   cadena2+=a + " ";
   a++;
   
  }
 
 }
}
