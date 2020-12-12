import java.util.Scanner;

public class ej8uni{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  String[] mes = {
  "enero", "febrero", "marzo", "abril", "mayo", "junio",
  "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
  };
  int[] temp = new int[12];
  
  for(int i=0; i<12;i++){
  System.out.print("Introduza la temperatura de " + mes[i] + " ");
  temp[i] = s.nextInt();
  }
  
  for (int i = 0; i < 12; i++) {
  System.out.printf("%12s " , mes[i]);
  for (int x = 0; x < temp[i]; x++) {
  System.out.print("");
  }
  System.out.println(" " + temp[i] + "ºC");
  }
  
}
}
