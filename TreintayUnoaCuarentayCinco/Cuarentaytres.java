package TreintayUnoaCuarentayCinco;

/** Programa 43
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que, de un vector de 10 posiciones con números dados por el usuario, calcule 
 * el promedio de los números almacenados en las posiciones impares del vector.
 * Date: 10/Abril/2023
*/  

import java.util.Scanner;

public class Cuarentaytres {
    public static void main(String[] args) {
        int i, i2 = 0;
        double[] vector = new double[10];
        double acumulador = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            vector[i] = sc.nextDouble();
            
            sc.close();

            if (i % 2 == 0) {
                i2++;
                acumulador += vector[i];
            }
        }
        
        System.out.println("El promedio es de " + (acumulador/i2));
    }
}
