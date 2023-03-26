package DieciseisaTreinta;

/** Porgrama 20 
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que determine el pago a un jugador de futbol profesional quien gana de acuerdo a lo siguiente:
 * Tiene un sueldo base Si es portero, tiene una prima de un 1% de su sueldo base por cada penalti que detenga, si el penalti fue en liguilla la prima 
 * es de 2%. Si es delantero, tiene una prima de 2% por gol, si gol fue en liguilla la prima es de 3%.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Veinte {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double acumulador;
		int contador;
		String resp1;
		String resp2;
		String resp3;
		int rol;
		double sueldobase;
		contador = 0;

		System.out.println("Bienvenido al calculador de pagos para jugadores de futbol");
		System.out.println("Por favor da el sueldo de base del jugador");
		sueldobase = scanner.nextDouble();

		System.out.println("Seleccione el rol del jugador");
		System.out.println("1. Portero ");
		System.out.println("2. Defensa ");
		System.out.println("3. Medio ");
		System.out.println("4. Delantero ");

		rol = scanner.nextInt();

		acumulador = 0;

		switch (rol) {
			case 1:
				System.out.println("¿El portero detuvo algun penalti? (Si/No)");
				resp1 = scanner.next();
				if (resp1.equalsIgnoreCase("si") || resp1.equalsIgnoreCase("s")) {
					do {
						contador++;
						System.out.println("¿El penalti atajado fue en liguilla? (Si/No)");
						resp2 = scanner.next();
						if (resp2.equalsIgnoreCase("si") || resp2.equalsIgnoreCase("s")) {
							acumulador += sueldobase * 0.02;
						} else {
							acumulador += sueldobase * 0.01;
						}
						System.out.println("¿El portero atajo otro penal? (Si/No)");
						resp3 = scanner.next();
					} while (!(resp3.equalsIgnoreCase("no") || resp3.equalsIgnoreCase("n")));
					System.out.println("Su sueldo base es de: $" + sueldobase);
					System.out.println("Usted tuvo " + contador + " atajadas de penalti");
					System.out.println("Sus primas por atajar penaltis son de: $" + acumulador);
					System.out.println("Su sueldo total es de: $" + (sueldobase + acumulador));
				} 
					else {
					System.out.println("Su sueldo es: $" + sueldobase);
				}
				break;

				case 2:
				System.out.println("Su sueldo es: $" + sueldobase);
				break;

				case 3:
				System.out.println("Su sueldo es: $" + sueldobase);
				break;

				case 4:
				System.out.println("¿El jugador anoto gol?");
				resp1 = scanner.next();
				if (resp1.equalsIgnoreCase("si") || resp1.equalsIgnoreCase("s")) {
					do {
						contador++;
						System.out.println("El gol fue en liguilla?");
						resp2 = scanner.next();
						if (resp2.equalsIgnoreCase("si") || resp2.equalsIgnoreCase("s")) {
							acumulador += sueldobase * 0.03;
						} else {
							acumulador += sueldobase * 0.02;
						}
						System.out.println("El jugador anoto otro gol?");
						resp3 = scanner.next();
					} while (!(resp3.equalsIgnoreCase("no") || resp3.equalsIgnoreCase("n")));
					System.out.println("Su sueldo base es de: $" + sueldobase);
					System.out.println("Usted anotó " + contador + " goles");
					System.out.println("Sus primas por goles anotados son de: $" + acumulador);
					System.out.println("Su sueldo total es de: $" + (sueldobase + acumulador));
				} else {
					System.out.println("Su sueldo es: $" + sueldobase);
				}
				break;
			default:
				System.out.println("Opcion Invalida");
            }

			scanner.close();
        }
    }