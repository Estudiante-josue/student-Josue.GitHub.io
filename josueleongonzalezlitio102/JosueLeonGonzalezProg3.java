package josueleongonzalezlitio102;
import java.util.Scanner;

public class JosueLeonGonzalezProg3 {
    public static void main(String[] args) {
      
        
          System.out.println("Nombre: josue leon gonzalez");
          System.out.println("Mmatricula: S22022266");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un numero:");
            int num = sc.nextInt();

      
  
            if ( (num > 9) || (num < 0) )  {
                System.out.println("Número invalido.");
            } else {
                System.out.println("ES DIGITO."); 
                }
            }
        }
}

