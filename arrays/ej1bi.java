import java.util.Scanner;

public class ej1bi{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  int[][] num = new int[3][6];
 
  num[0][0] = 0;
  num[0][1] = 30;
  num[0][2] = 2;
  num[0][5] = 7;
  num[1][0] = 75;
  num[1][4] = 0;
  num[2][2] = -2;
  num[2][3] = 9;
  num[2][5] = 11;
  
  int fila;
  int colum;
  
  System.out.print("      ");
  for(colum=0;colum<6;colum++){
  System.out.print(" columna"+ colum);
  }
  for(fila= 0;fila<3;fila++){
  System.out.print("\nfila " + fila);
  for(colum=0;colum<6;colum++){
  System.out.print("       " + num[fila][colum]);
  }
 }
 
 }
}
