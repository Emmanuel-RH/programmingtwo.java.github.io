package DieciseisaTreinta;

/** Porgrama 23
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Programa en Java que pida un texto al usuario y lo imprima en pantalla, ejecutar mientras el usuario desee seguir imprimiendo 
 * textos en la pantalla (Do While).
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Veintitres {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String frase;
		String resp;

		do{
		System.out.println("Porfavor ingresa un texto");
		frase = scanner.nextLine();

		System.out.println("El texto ingresado fue "+frase);

		System.out.println("Desea ingresar otra frase?");
		resp = scanner.nextLine();
    }
		while(resp.equals("si") || resp.equals("SI") || resp.equals("Si") || resp.equals("S") || resp.equals("s"));
			System.out.println("Salio del sistema");

        scanner.close();
	}
}
