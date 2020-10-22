import java.util.Scanner;

public class pirnumfib {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("hasta que altura quiere llegar ");
  int y = s.nextInt();
  int espacio = y-1;
  int a= 1;
  int b= 1;
  String cadena= ""; 
  String cadena2= "";

  for(int x =0;x<y;x++){
    for(int z=0;z<espacio;z++){
     System.out.print(" ");
    
    
    
    
    
    }
    
    cadena+=a +"";
    System.out.println(cadena+""+cadena2);
    a++;
    cadena2 =b + cadena2;
    b++;
    espacio--;
   
    
    
  
  }
  
  
  
 }
}
