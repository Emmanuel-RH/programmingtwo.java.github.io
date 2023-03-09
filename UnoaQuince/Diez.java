package UnoaQuince;

/**Programa 10
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: Diagrama de flujo y programa en Java que pida el precio de un articulo y muestre
 * el precio final incluyendo el 16% de IVA.
 * Fecha: 05/03/23
*/ 

import java.util.Scanner;

public class Diez {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        
        System.out.println("¡Bienvenido a calculador de IVA!");

        System.out.println("Ingresa el valor de tu artículo: ");
        int precio = sc.nextInt();

        double iva = 1.16;
        double resultado = iva * precio;

        System.out.println("El precio de su producto es de: " + precio + ". El precio final de su producto con IVA es de: " + resultado);

        sc.close();
    }
}
