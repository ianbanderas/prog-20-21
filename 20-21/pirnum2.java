import java.util.Scanner;

public class pirnum2 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("hasta que altura quiere llegar ");
  int y = s.nextInt();
  int espacio = y-1;
  int a= 1;
  String cadena= ""; 

  for(int x =0;x<y;x++){
    for(int z=0;z<espacio;z++){
     System.out.print(" ");
    
    }
    
    if(a>9){
    a=0;
    }
    cadena+=a +"";
    System.out.println(cadena);
    a++;
     if(a>9){
    a=0;
    }
    cadena+=a +"";
    a++;
    espacio--;
   
  }
  
  
  
 }
}
