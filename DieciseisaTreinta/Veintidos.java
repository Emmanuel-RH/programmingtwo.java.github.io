package DieciseisaTreinta;

/** Porgrama 22
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que dado un número por el usuario calcule la tabla de multiplicar (FOR)
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Veintidos {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int contador;
		int multiplicacion;
		int num;

        contador = 0;

		System.out.println("Ingrese un numero para obtener su tabla de multiplicar");
		num = scanner.nextInt();

		System.out.println("Tabla de multiplicar del numero "+num);

		for (contador=1;contador<=10;contador++) {
			multiplicacion = num*contador;
			
            System.out.println(num+" X "+contador+" = "+multiplicacion);

            scanner.close();
		}
	}
}