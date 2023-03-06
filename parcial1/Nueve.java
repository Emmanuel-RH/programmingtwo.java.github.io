package parcial1;

/**Programa 9
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: Diagrama de flujo y programa en Java que pida el sueldo de 3 trabajadores , al
 * primero de aplicara un incremento del 12% y el tercero 15% mostrar el sueldo de cada
 * uno.
 * Fecha: 05/03/23
*/ 

import java.util.Scanner;

public class Nueve {
    public static void main(String []args){

        Scanner input = new Scanner (System.in);

        System.out.println ( "Inserte sueldo del primer trabajador:");
        int sueldo1 = input.nextInt(); 

        System.out.println ( "Inserte sueldo del Segundo trabajador:");
        int sueldo2 = input.nextInt(); 

        System.out.println ( "Inserte sueldo del Tercer trabajador:");
        int sueldo3 = input.nextInt(); 
        
        double incremento1 = 1.12;
        double resul1 = sueldo1 * incremento1;
            
        System.out.println("El incremento del primer trabajador es:" + resul1 );

        System.out.println("El incremento del primer trabajador es:" + sueldo2 );

        double incremento3 = 1.15;
        double resul3 = sueldo3 * incremento3;

        System.out.println("El incremento del primer trabajador es:" + resul3 );

        input.close();
    }
}
