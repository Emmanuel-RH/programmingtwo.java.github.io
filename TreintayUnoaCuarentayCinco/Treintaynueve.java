package TreintayUnoaCuarentayCinco;

/** Programa 38
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que, de un vector de 10 posiciones con números enteros dados por el usuario, determine 
 * cuantos números fueron pares y cuantos impares.
 * Date: 30/Marzo/2023
*/   

import java.util.Scanner; //Importar libreria para que se pueda leer los datos ingresados por el usuario.

public class Treintaynueve {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int parCont = 0, imparCont = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (vector[i] % 2 == 0) {
                parCont++;
            } else {
                imparCont++;
            }
        }
        System.out.println("El vector tiene " + parCont + " pares");
        System.out.println("El vector tiene " + imparCont + " impares");
        sc.close();
    }
}