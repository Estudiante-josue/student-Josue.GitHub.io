package josueleongonzalezlitio102;
import java.util.Scanner;


public class JosueLeonGonzalezProg2 {
     
   class Main {

        public static void main(String[] args) {
            System.out.println("Nombre: josue leon gonzalez");
            try (Scanner escaner = new Scanner(System.in)) {
                // Mandar mensaje
                System.out.println("Escribe un número:");
                // Leer lo que se introduce
                double numero = escaner.nextDouble();
                // Comparar
                if (numero == 0) {
                    System.out.println("El numero es cero");
                } else if (numero < 0) {
                    System.out.println("El numero es negativo");
                } else {
                    System.out.println("El numero es positivo");
                }
            }
        }
    } 
}


