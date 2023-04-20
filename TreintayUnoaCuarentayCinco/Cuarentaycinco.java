package TreintayUnoaCuarentayCinco;

/** Programa 45
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que llene un vector de 10 posiciones con números dados por el usuario, 
 * con la restricción que solo se llenará con números pares.
 * Date: 10/Abril/2023
*/  

import java.util.Scanner;

public class Cuarentaycinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosPares = new int[10];
        int num, i = 0;
        
        System.out.print("Ingrese 10 números pares: " + " ");
        
        while (i < 10) {
            num = sc.nextInt();
            if (num % 2 == 0) { // Verificar si es par
                numerosPares[i] = num;
                i++;
            } else {
                System.out.println("El número ingresado no es par, intente de nuevo.");
            }
        }
        sc.close();
         
        System.out.println("_____________________________________________");
        System.out.println("Los números ingresados son: ");
        for (i = 0; i < 10; i++) {
            System.out.println("En la  Posición "+i + " esta el numero "+ numerosPares[i] + " " );
        }
    }
}