//Las matrices siempre se recorren fila- columna, por lo tanto M[F-C].
//Programa que llene y muestre una matriz de 3x3 por columna.

import java.util.Scanner;

public class matrizcolumna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Pedir al usuario que ingrese los valores de la matriz
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("Ingrese el valor de la fila " + (i+1) + " y la columna " + (j+1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimir la matriz por columna
        System.out.println("La matriz ingresada es:");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}