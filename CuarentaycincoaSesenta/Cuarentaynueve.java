package CuarentaycincoaSesenta;

/** Porgrama 49
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que, de dos vectores de 10 posiciones con 
 * números dados por el usuario, determine si son iguales.
 * Date: 26/Abril/2023
*/  

import java.util.Scanner;

public class Cuarentaynueve {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] vectoruno = new int[10];
        int[] vectordos = new int[10];

        // Pedimos al usuario que ingrese los números a comparar
        for (int i = 0; i < vectoruno.length; i++) {
            System.out.print("Ingrese un número para el primer vector: ");
            System.out.println(" ");
            vectoruno[i] = entrada.nextInt();
        }

        // Pedimos al usuario que ingrese los números a comparar
        for (int i = 0; i < vectordos.length; i++) {
            System.out.print("Ingrese un número: ");
            System.out.println(" ");
            vectordos[i] = entrada.nextInt();
        }

        entrada.close();


    }
}