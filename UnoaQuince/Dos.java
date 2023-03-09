package UnoaQuince;

/**Programa 2
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: Pedir un numero al usuario y posteriormente que lo muestre
 * Fecha: 05/03/23
*/ 

import java.util.Scanner; 

public class Dos {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digita un número: ");
        int digito =sc.nextInt();

        System.out.println("Su número es: " + digito);

        sc.close();
    }
}
