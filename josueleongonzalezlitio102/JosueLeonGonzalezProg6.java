package josueleongonzalezlitio102;
import java.util.Scanner;
public class JosueLeonGonzalezProg6 {
    public static void main(String args[]){
        //imprime 
        System.out.println("Josue Leon Gonzalez");
        
        try(Scanner sc = new Scanner(System.in)){
          System.out.println("Ingresa un numero");
          int n= sc.nextInt();
          
      for (int i = 2; i <= n; i=i+2) {
        System.out.println(i); 
      }
  }
  }
}