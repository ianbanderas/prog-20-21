import java.util.Scanner;

public class potencias {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("escriba un numero y la potencia que quiere que llegue " + Math.pow(7.2, 2));
  int x = s.nextInt();
  int y = s.nextInt();
  int a = 1;
  int b = x;
for(int z=0;z<y;z++) {


System.out.println(x + "^" + a + "= " + (b));
a++;
b= b*x;

}

}
}
