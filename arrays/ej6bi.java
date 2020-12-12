public class ej6bi {
 public static void main(String[] args) {
 

  int[][] num = new int[6][10];
  
  int fila=6;
  int colum=10;
  int min = Integer.MAX_VALUE;
  int max = Integer.MIN_VALUE;
  int mini=0;
  int minx=0;
  int maxi=0;
  int maxx=0;
  boolean repe;
  
  for(fila = 0; fila < 6; fila++) {
   for(colum = 0; colum < 10; colum++) {
    do {
      num[fila][colum] = (int)(Math.random() * 1001);
      repe = false;
      for (int i = 0; i < 10 * fila + colum; i++) {
        if (num[fila][colum] == num[i / 10][i % 10]) {
         repe = true;
        }
      }
    } while (repe);
   }
  }
  
  for(int i=0;i<fila;i++){
    for(int x=0;x<colum;x++){
   // num[i][x]=(int)(Math.random()*1001);
    System.out.print(num[i][x] + "  ");
    }
    System.out.println();
  }
  
  for(int i=0;i<fila;i++){
    for(int x=0;x<colum;x++){
     if(num[i][x]<min){
     min=num[i][x];
     mini = i;
     minx = x;
     }
     if(num[i][x]>max){
     max=num[i][x];
     maxi = i;
     maxx = x;
     }
      
    }
  }
  System.out.println();
      
  System.out.println("el mínimo es: " + min + " en la fila: " + mini + " y columna: " + minx);
  
  System.out.println("el máximo es: " + max + " en la fila: " + maxi + " y columna: " + maxx);
 }
}
