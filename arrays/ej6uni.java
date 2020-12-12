import java.util.Scanner;

public class ej6uni{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  int[] num = new int[15];
  
  int a;
 
 System.out.print("Introduca los numeros enteros 1 a 1: ");
 
 for(int i=0;i<15;i++){
 num[i]= s.nextInt();
 }
 System.out.println("array 1");
 for(int i=0;i<15;i++){
 System.out.print(num[i] + " ");
 }
 
 a= num[14];
  
 for(int i=14;i>0;i--){
   num[i]=num[i-1];
 }
  num[0]= a;
  System.out.println();
  System.out.println("array rotado");
 for(int i=0;i<15;i++){
 System.out.print(num[i] + " ");
 }
  
  
 }
}
