package TreintayUnoaCuarentayCinco;

/** Programa 44
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que llene un vector de 10 posiciones con los números que usted desee y 
 * muestre al usuario los números que fueron almacenados.
 * Date: 10/Abril/2023
*/  

import java.util.Scanner;

public class Cuarentaycuatro {
    public static void main(String[] args) {
        int i;
        double[] vector = new double[10];
        
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            vector[i] = sc.nextDouble();
            sc.close();
        }

        System.out.println("Los valores del vector son:");
        
        for (i = 0; i < 10; i++) {
            System.out.println(vector[i]);
        }
    }
}