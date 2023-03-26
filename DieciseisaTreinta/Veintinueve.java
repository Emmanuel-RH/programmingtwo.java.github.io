package DieciseisaTreinta;

/** Porgrama 29
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Programa que de N números dados por el usuario determine cuantos fueron pares y cuantos impares.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Veintinueve {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int i = 0, i2 = 0, num;
            char resp;

            do {
                System.out.println("Dame un número:");
                num = entrada.nextInt();
                if (num % 2 == 0) {
                    i++;
                } else {
                    i2++;
                }
                System.out.println("¿Hay otro número? (s/n)");
                resp = entrada.next().charAt(0);

            } while (resp == 's' || resp == 'S');
            System.out.println("El total de números pares ingresados fue de: " + i);
            System.out.println("El total de números impares ingresados fue de: " + i2);
        }
    }
}