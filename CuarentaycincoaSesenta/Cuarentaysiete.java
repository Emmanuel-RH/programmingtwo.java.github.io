package CuarentaycincoaSesenta;

/** Porgrama 47
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Programa en java que calcule la tabla de multiplicar de los numeros de los vectores almacenados en un vector de 10 posiciones.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Cuarentaysiete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        
        // Pedimos al usuario que ingrese los números a multiplicar
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un número: ");
            vector[i] = sc.nextInt();
        }

        // Calculamos y mostramos las tablas de multiplicar
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Tabla de multiplicar del número " + vector[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(vector[i] + " x " + j + " = " + (vector[i] * j));
            }
            System.out.println();

            sc.close();
        }
    }
}