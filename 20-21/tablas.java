import java.util.Scanner;

public class tablas {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
 
 System.out.print("indique 1 numero");
 int x = s.nextInt();
 int prueba = x%2;
 int a=1;
 
if(prueba == 0) {
  
  for(int z=0;z<10;z++) {

System.out.println(x + "*" + a + "= " + (x*a));
a++;

}
} else {
  
 for(int y=0;y<10;y++) {

System.out.println(x + "+" + a + "= " + (x+a));
a++;

}

}



 }
}
