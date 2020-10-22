import java.util.Scanner;

public class ticket {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

System.out.print("indique nombre, precio y cantidad del 1º articulo: ");

String art1 = s.next();
double p1 = s.nextDouble();
int c1 = s.nextInt();

System.out.print("indique nombre, precio y cantidad del 2º articulo: ");

String art2 = s.next();
double p2 = s.nextDouble();
int c2 = s.nextInt();

System.out.print("indique nombre, precio y cantidad del 3º articulo: ");

String art3 = s.next();
double p3 = s.nextDouble();
int c3 = s.nextInt();


double sub1 = p1*c1;
double sub2 = p2*c2;
double sub3 = p3*c3;
double total= (sub1+sub2+sub3);

System.out.printf("%-17s %-11s  %-12s %-14s\n","Artículo","Cantidad","Precio","Subtotal");
for(int x=0;x<65;x++){
System.out.print("-");
}
System.out.println("");

System.out.printf("%-15s %3d %15.2f %12.2f\n", art1,c1,p1,sub1);
System.out.printf("%-15s %3d %15.2f %12.2f\n", art2,c2,p2,sub2);
System.out.printf("%-15s %3d %15.2f %12.2f\n", art3,c3,p3,sub3);

for(int x=0;x<65;x++){
System.out.print("-");
}
System.out.println("");

System.out.printf("%-15s %30.2f\n","Total",total);


}
}
