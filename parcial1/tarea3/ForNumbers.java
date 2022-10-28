public class ForNumbers {
    // Program to print numbers from 1 to 5
    public static void main(String[] args) {
    
      int n = 100;
      // for loop  
      System.out.println("tabla del 1 ");
      for (int i = 1; i <= n; ++i) {
        System.out.println(i);
      }

      System.out.println("tabla del 2 ");
      for (int i = 9; i <= n; i=i+9) {
        System.out.println(i);
      }
      System.out.println("pares menores de 100");
      for (int i = 2 ; i <= n; i=i+2) {
        System.out.println(i);
      }
      n=50;
      System.out.println("impares entre 10 y 50 ");
      for (int i = n ; i <= 18; i=i+3){
        System.out.println(i);
      }
    
      System.out.println("pares menores de 100 de forma descendente");
      for (int i = n; i >= 2; i=i-2){
        System.out.println(i);
      }
      n=50;
      System.out.println("impares entre 18 y 50 en forma desendente ");
      for (int i = n; i >= 18; i=i-3){
        System.out.println(i);
      }

    }
  }

