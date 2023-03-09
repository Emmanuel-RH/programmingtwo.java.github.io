package UnoaQuince;

/**Programa 5
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: Diagrama de flujo y programa Java que determine si un numero dado por el
 * usuario es par o impar.
 * Fecha: 05/03/23
*/ 

import java.util.Scanner;

public class Cinco {
    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce tu numero: ");
    int num = sc.nextInt();

    if (num % 2 == 0 ){
        System.out.println("El numero: " + num + " es par.");
    }
    else{
        System.out.print("El numero: " +num + " es impar.");
    }

    sc.close();
    }
}
