package UnoaQuince;

/**Programa 6
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: Diagrama de flujo y programa en Java que dos números dados por el usuario
 * indiqué cual es el mayor .
 * Fecha: 05/03/23
*/ 

import java.util.Scanner;

public class Seis {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("El primer numero es el mayor.");
        }
        else{
            System.out.println("El segundo numero es mayor.");
        }

        sc.close();
    }
}
