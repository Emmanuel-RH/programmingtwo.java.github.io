package DieciseisaTreinta;

/** Porgrama 26
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Programa que de N números dados por el usuario saque su multiplicación.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Veintiseis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num, mult = 1;
        String resp;

        do {
            System.out.println("Da un número:");
            num = scanner.nextInt();
            mult *= num;
            
            System.out.println("Hay otro número? (s/n)");
            resp = scanner.next();
        } while (resp.equalsIgnoreCase("s"));

        System.out.println("La multiplicación de los números es: " + mult);

        scanner.close();
    }
}
