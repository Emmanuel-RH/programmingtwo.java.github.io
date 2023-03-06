package parcial1;

/**Programa 7
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: Diagrama de flujo y programa en Java que tres números dados por el usuario 
 * indiqué cual es el mayor.
 * Fecha: 05/03/23
*/ 

import java.util.Scanner;

public class Siete {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Introduce el tercer numero: ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);                                             
            } else {
                System.out.println("El mayor es: " + num3);     
            }
        } else if (num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
        
        sc.close();
    }
}
