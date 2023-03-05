package parcial1;
import java.util.Scanner; 

public class Catorce { 
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in); 

        System.out.println ( "Inserte pago por hora:");
        int PH = input.nextInt(); 
        
        { 
        double flotante1 = 1.00;
        double resul1 = PH / flotante1;
        System.out.println("El pago por hora del trabajador americano es: " + resul1 );
        } 
        
        { 
        double flotante2 = 0.8;
        double resul2 = PH * flotante2;
        System.out.println("El pago por hora del trabajador residente es: " + resul2 );
        } 
        
        { 
        double flotante3 = 0.6;
        double resul3 = PH * flotante3;
        System.out.println("El pago por hora del trabajador ilegal es: " + resul3 );
        } 
        
        input.close(); 
    } 
} 
