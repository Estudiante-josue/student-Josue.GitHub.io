package josueleongonzalezlitio102;

public class JosueLeonGonzalezProg9 {
    public static void main(String args[]) {
        System.out.println("Nombre: Josue Leon Gonzalez");
        System.out.println("Matricula: S22022266");
    
        int n = 3;
        
        int a[][] = { {0, 1, 2},
                      {0, 3, 8},
                      {0, 2, 9},
                     
                    };
        
    printPrincipalDiagonal(a, n);
    
    int suma = 0;
       
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                if (i==j) {
    
                    suma += a[i][j];
                }
            }
        }
        
        System.out.println("La suma de la diagonal es: "+suma);
    }
    static void printPrincipalDiagonal(int mat[][], int n)
    {
        System.out.print("Principal Diagonal: ");
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                if (i == j) {
                
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
       
        System.out.println("");
        
        
    }
}

