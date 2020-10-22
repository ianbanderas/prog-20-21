import java.util.Scanner;

public class frase {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
System.out.print("escribe un numero de la tabla de multiplicar y cuantas filas ");

int x = s.nextInt();
int y = s.nextInt();
int a = 1;

for(int z=0;z<y;z++) {

System.out.println(x + "*" + a + "= " + (x*a));
a++;

}

}
}
