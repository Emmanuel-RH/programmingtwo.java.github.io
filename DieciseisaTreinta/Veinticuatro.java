package DieciseisaTreinta;

/** Porgrama 24
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Programa que de N números dados por el usuario determine cuál es el mayor.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Veinticuatro {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int num;
        int mas;
        String resp;
        mas = 0;

        do {
            System.out.println("Por favor ingresa un numero");
            num = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Desea ingresar otro numero?");
            resp = scanner.nextLine();

            if (num > mas) {
                mas = num;
            }

        } while (resp.equals("si") || resp.equals("SI") || resp.equals("Si") || resp.equals("S") || resp.equals("s"));
        System.out.println("El numero mayor es: " + mas);

        scanner.close();
    }
}
