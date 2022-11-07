package parcial1.tarea4;

import java.util.Scanner;


public class Promedio {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int n;
            double suma = 0;
            int calificacion;
            double promedio; 

            System.out.println("ingrese la cantidad de calificaciones");

            n=entrada.nextInt() ;

            for (int i = 1; i <= n; i++) {
                 calificacion =entrada.nextInt();
                
                suma=suma+calificacion;

            }

            promedio=suma/n;
            System.out.println("el promedio es:" + promedio);
        }

    }
}
