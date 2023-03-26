package DieciseisaTreinta;

/** Porgrama 28
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Programa que de 10 números dados por el usuario determine si es par o impar.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Veintiocho {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int i = 0, num;
            
            while (i <= 10) {
                i++;
                System.out.println("Dame un número:");
                num = entrada.nextInt();
                if (num % 2 == 0) {
                    System.out.println("El número " + num + " es par");
                } else {
                    System.out.println("El número " + num + " es impar");
                }
            }
        }
    }
}