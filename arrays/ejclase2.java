import java.util.Scanner;

public class ejclase2{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

  System.out.print("indique filas y columnas separadas por un espacio");
  int filas = s.nextInt();
  int columnas = s.nextInt();  
  int x;
  int largo = filas*columnas;
  int[] matriz = new int[largo];
  int contador = 0;


  for(int i=0;i<filas;i++){
    for(int j=0;j<columnas;j++){
    x = (int)(Math.random()*100)+1;
    matriz [contador] = x;
    System.out.print(matriz[contador] + " ");    
    contador++;
    }
  System.out.println();
  }
  
  System.out.println();
  for(int i=0;i<largo;i++){
  System.out.print(matriz[i] + " ");  
  }


 }
}
