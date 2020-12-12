import java.util.Scanner;

public class ej5uni{
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  int[] num = new int[10];
  int min;
  int max;
  
  System.out.print("vaya introduciendo números: ");
  
  num[0] = s.nextInt();
  min=num[0];
  max=num[0];
  
  for(int i=1;i<10;i++){
    num[i] = s.nextInt();
    
    if(num[i] < min) {
    min=num[i];
    }
    
    if(num[i] > max) {
    max=num[i];
    }
  }
  System.out.println();
  
  for (int i=0;i<10;i++){
    System.out.print(num[i]);
    if(num[i]==max){
    System.out.print(" máximo");
    } 
    if(num[i]==min){
    System.out.print(" mínimo");
    }
    System.out.println();
  }
  
 }
}
