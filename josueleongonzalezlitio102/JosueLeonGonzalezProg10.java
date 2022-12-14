package josueleongonzalezlitio102;

public class JosueLeonGonzalezProg10 {
    public static void main(String args[]){
        System.out.println("Nombre: Josue Leon Gonzalez");
        System.out.println("Matricula: S22022266");
   
int a[][] = {
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},

};
System.out.println("Diagonal inferior");


        for (int i = 0; i < 8; ++i){
            for (int j = 0; j < 8; ++j){
                if (i>=j){
                    a[i][j] = i+1;
                }

}
}
 
        for (int i = 0; i < 8; ++i){
            for (int j = 0; j < 8; ++j){
                System.out.print(a[i][j] + " ");
    }
            System.out.println();
            
    }
    int suma = 0;

    for (int i = 0; i < 8; ++i){
        for (int j = 0; j < 8; ++j){
          
            if (i>=j){
                a[i][j] = i+1;
                suma += a[i][j];
            }
        }
    }
    
    System.out.println("Los datos inferiores son: "+suma); 
}
}
