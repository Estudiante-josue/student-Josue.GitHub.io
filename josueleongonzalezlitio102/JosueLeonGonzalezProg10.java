package josueleongonzalezlitio102;

public class JosueLeonGonzalezProg10 {
    public static void main(String args[]){

        //Imprimimos el nombre y la matricula del usuario
        System.out.println("Nombre: Josue Leon Gonzalez");
        System.out.println("Matricula: S22022266");
   
        //Declaramos un array con una variable
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

//Imprimos el array
System.out.println("Diagonal inferior");

    //Agregamos un for donde  
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
