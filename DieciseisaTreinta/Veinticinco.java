package DieciseisaTreinta;

/** Porgrama 25
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Programa que de N números dados por el usuario saque su sumatoria.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Veinticinco {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int num;
        int suma;
        String resp;
        suma = 0;

        do {
            System.out.println("Por favor ingresa un numero");
            num = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Desea ingresar otro numero?");
            resp = scanner.nextLine();

                suma = suma+num;

        } while (resp.equals("si") || resp.equals("SI") || resp.equals("Si") || resp.equals("S") || resp.equals("s"));
        System.out.println("El numero mayor es: " + suma);

        scanner.close();
    }
}
