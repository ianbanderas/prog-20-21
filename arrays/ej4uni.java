import java.util.Scanner;

public class ej4uni{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  int[] num = new int[20];
  int[] cuad = new int[20];
  int[] cubo = new int[20];
  
  for(int i=0;i<20;i++){
    num[i]=(int)(Math.random()*101);
    cuad[i]= num[i]*num[i];
    cubo[i]=cuad[i]*num[i];
    }
    
  for(int i=0;i<20;i++){
    System.out.println("num: "+num[i]+"  cuadrado: "+cuad[i]+"  cubo: "+cubo[i]);
  }
 }
}
