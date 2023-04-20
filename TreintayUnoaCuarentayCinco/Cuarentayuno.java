package TreintayUnoaCuarentayCinco;

/** Programa 41
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que, de un vector de 10 posiciones con números dados por el usuario, encuentre el número mayor.
 * Date: 10/Abril/2023
*/  

import java.util.Scanner;

public class Cuarentayuno {
    public static void main(String[] args) {
        int i;
        double mayor = 0;
        double[] vector = new double[10];
        
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            vector[i] = sc.nextDouble();
            if (vector[i] > mayor) {
                mayor = vector[i];
            }

            sc.close();
        }
        
        System.out.println("El mayor de los numeros del vector es: " + mayor);
        
    }
}