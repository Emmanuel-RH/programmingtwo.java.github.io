package TreintayUnoaCuarentayCinco;

/** Programa 38
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que solicite 5 números al usuario, los almacene en un vector y al final los muestre indicando 
 * en que posición del vector se encuentra cada uno.
 * Date: 30/Marzo/2023
*/  

import java.util.Scanner; //Importar libreria para leer caracteres que introduce el usuario.

public class Treintayocho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.println("Los números ingresados y sus posiciones de menor a mayor son: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("El número " + vector[i] + " se encuentra en la posición " + (i+1));
        }

        sc.close();
    }
}