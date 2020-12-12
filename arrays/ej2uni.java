import java.util.Scanner;

public class ej2uni{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  char[] simbolo = new char[10];
  
  simbolo[0] = 'a';
  simbolo[1] = 'x';
  simbolo[4] = '@';
  simbolo[6] = ' ';
  simbolo[7] = '+';
  simbolo[9] = 'Q';
  
  for (int x=0; x<simbolo.length;x++) {
  System.out.println("simbolo(" + x + "): " + simbolo[x]);
  }
  
  //aparece como espacio en blanco
  
 }
}
