package DieciseisaTreinta;

/** Porgrama 27
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Programa que de N números dados por el usuario, reste el segundo del primero 
 * siempre y cuando el primero sea mayor al segundo.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Veintisiete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, rest;
        String resp;

        do {
            System.out.println("Da un número:");
            num1 = scanner.nextInt();

            System.out.println("Da un número:");
            num2 = scanner.nextInt();

            if(num1>num2)
            {
                rest = num1-num2;
                System.out.println("La resta del primer numero menos el segundo es:" +rest);
            }

            System.out.println("Hay otro número? (s/n)");
            resp = scanner.next();

        } while (resp.equalsIgnoreCase("s"));

        scanner.close();
    }
}