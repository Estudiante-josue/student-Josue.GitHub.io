package josueleongonzalezlitio102;
import java.util.Scanner;

public class JosueLeonGonzalezProg4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
  
      try (Scanner sc = new Scanner(System.in)) { 
          System.out.println("Ingrese un numero:");
          int mes = sc.nextInt();
          
      String mesString;
      switch (mes) {

      case 1:  mesString = "Enero";
               break;
      case 2:  mesString  = "Febrero";
               break;
      case 3:  mesString = "Marzo";
               break;
      case 4:  mesString = "Abril";
               break;
      case 5:  mesString = "Mayo";
               break;
      case 6:  mesString = "Junio";
               break;
      case 7:  mesString = "Julio";
               break;
      case 8:  mesString = "Agosto";
               break;
      case 9:  mesString = "Septiembre";
               break;
      case 10: mesString = "Octubre";
               break;
      case 11: mesString = "Noviembre";
               break;
      case 12: mesString = "Diciembre";
               break;
      default: mesString = "Invalid month";
               break;
      }
      System.out.println(mesString);
  }
}
}



