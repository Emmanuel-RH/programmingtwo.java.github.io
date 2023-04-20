//Las matrices siempre se recorren fila- columna, por lo tanto M[F-C].
//Programa que llene y muestre una matriz de 3x3 por fila.

import java.util.Scanner;

public class matrizfila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Pedir al usuario que ingrese los valores de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor de la fila " + (i+1) + " y la columna " + (j+1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimir la matriz por fila
        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("| " + matriz[j][i] + " | ");
            }
            System.out.println();
        }

        sc.close();
    }
}