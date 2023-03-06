package parcial1;

/**Programa 14
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: Una empresa americana tiene trabajadores con diversos estados migratorios en
 * Estados Unidos y de acuerdo a su estado es el pago por hora. El Americano gana el
 * 100% del precio de hora normal, el Residente gana el 80% del precio por hora y el
 * ilegal gana solo el 60% del precio normal. Calcular el sueldo final de la semana de un
 * trabajador de esta empresa.
 * Fecha: 05/03/23
*/ 

import java.util.Scanner; 

public class Catorce { 
    public static void main (String[] args) {
       
        Scanner input = new Scanner (System.in); 

        System.out.println ( "Introduzca pago por hora: ");
        int PH = input.nextInt(); 

        System.out.println("Introduzca las horas trabajadas diarias (Máximo 12): ");
        int HT = input.nextInt();

        System.out.println(" ");

        {
        double flotante1 = 1.00;
        double resul1 = PH / flotante1;
        double Semana = HT * resul1;
        System.out.println("El pago por hora del trabajador americano es: $" + resul1 );
        System.out.println("El pago diario del trabajador es de: $" + (HT * resul1));
        System.out.println("El pago semanal del trabajador es de: $" + (Semana * 7));
        } 
        
        System.out.println(" ");

        { 
        double flotante2 = 0.8;
        double resul2 = PH * flotante2;
        double Semana = HT * resul2;
        System.out.println("El pago por hora del trabajador residente es: $" + resul2 );
        System.out.println("El pago diario del trabajador es de: $" + (HT * resul2));
        System.out.println("El pago semanal del trabajador es de: $" + (Semana * 7));
        } 
        
        System.out.println(" ");
        
        {
        double flotante3 = 0.6;
        double resul3 = PH * flotante3;
        double Semana = HT * resul3;
        System.out.println("El pago por hora del trabajador ilegal es: $" + resul3 );
        System.out.println("El pago diario del trabajador es de: $" + (HT * resul3));
        System.out.println("El pago semanal del trabajador es de: $" + (Semana * 7));
        } 

        
        input.close(); 
    } 
} 