package TreintayUnoaCuarentayCinco;

/** Porgrama 40
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que, de un vector de 10 posiciones con números dados por el usuario, 
 * calcule el promedio de los números almacenados en las posiciones pares del vector.
 * Date: 30/Marzo/2023
*/ 

import java.util.Scanner; //Importar libreria para que se pueda leer los datos ingresados por el usuario.

public class Cuarenta {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int i, i2;
            i2=0;
            double[] vector = new double[10];
            double acumulador = 0;

            for (i = 0; i < 10; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                vector[i] = sc.nextDouble();
                if (i % 2 != 0) {
                    i2++;
                    acumulador += vector[i];
                }
            }
            
            System.out.println("El promedio es de " + acumulador / i2);
        }
    }   
}