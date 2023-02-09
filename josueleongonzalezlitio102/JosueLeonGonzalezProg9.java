package josueleongonzalezlitio102;

public class JosueLeonGonzalezProg9 {
    public static void main(String args[]) {

        //Imprimimos información del usuario y la matricula
        System.out.println("Nombre: Josue Leon Gonzalez");
        System.out.println("Matricula: S22022266");
    
        //Declaramos un variable
        int n = 3;
        
        //Declaramos un array que contenga los digitos requeridos
        int a[][] = { {0, 1, 2},
                      {0, 3, 8},
                      {0, 2, 9},
                     
                    };
        
    printPrincipalDiagonal(a, n);
    
    //Declaramos otra variable para poder recorrerla en el array
    int suma = 0;
       
                    //Agregamos un for que recorra el array y haga el proceso de sumarlo
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                if (i==j) {
    
                    suma += a[i][j];
                }
            }
        }
        
        //Imprimimos el resultado de la suma de la diagonal
        System.out.println("La suma de la diagonal es: "+suma);
    }
    static void printPrincipalDiagonal(int mat[][], int n)
    {

        //Imprimimos la principal diagonal del array
        System.out.print("Principal Diagonal: ");
    
        //Agregamos un for que recorra el array de forma diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                if (i == j) {
                
                    //Agregamos una separación para la estetica del array
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
       
        //Agregamos un comentario para darle un espaciado
        System.out.println("");
        
        
    }
}

