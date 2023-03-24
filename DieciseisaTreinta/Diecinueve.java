package DieciseisaTreinta;

/** Porgrama 19
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que determine el pago a un jugador de basquetbol profesional quien gana de acuerdo a lo siguiente:
 * tiene un sueldo base. Si es defensa, tiene una prima de un 1% de su sueldo base por cada bloqueo que realice, si el bloqueo fue en playoff 
 * la prima es de 2%. Si es ofensivo, tiene una prima de 2% por canasta, si la canasta fue en playoff la prima es de 3%.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Diecinueve {
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
		
            System.out.println("Calculadora de pagos para jugadores de basquetbol");
		    System.out.print("Por favor ingrese el sueldo base del jugador: $");
		    sueldobase = scanner.nextDouble();
		    System.out.println("Seleccione el rol del jugador: ");
		    System.out.println("1. Defensivo; ");
		    System.out.println("2. Ofensivo: ");
		    rol = scanner.nextInt();

		    acumulador = 0;

		switch (rol) {
			case 1:
				System.out.println("¿El defensa realizó bloqueos? (Si/No)");
				resp1 = scanner.next();
				if (resp1.equalsIgnoreCase("si") || resp1.equalsIgnoreCase("s")) {
					do {
						contador++;
						System.out.println("¿El bloqueo fue en Playoff? (Si/No)");
						resp2 = scanner.next();
						if (resp2.equalsIgnoreCase("si") || resp2.equalsIgnoreCase("s")) {
							acumulador += sueldobase * 0.02;
						} else {
							acumulador += sueldobase * 0.01;
						}
						System.out.println("¿El defensa realizó otro bloqueo? (Si/No)");
						resp3 = scanner.next();
					} while (!(resp3.equalsIgnoreCase("no") || resp3.equalsIgnoreCase("n")));
					System.out.println("Su sueldo base es de: $" + sueldobase);
					System.out.println("Usted tuvo " + contador + " bloqueos");
					System.out.println("Sus primas por bloqueos son de: $" + acumulador);
					System.out.println("Su sueldo total es de: $" + (sueldobase + acumulador));
				} else {
					System.out.println("Su sueldo es: $" + sueldobase);
				}
				break;
			
            case 2:
				System.out.println("¿El jugador anotó canastas? (Si/No)");
				resp1 = scanner.next();
				if (resp1.equalsIgnoreCase("si") || resp1.equalsIgnoreCase("s")) {
					do {
						contador++;
						System.out.println("¿La canasta fue en Playoff? (Si/No)");
						resp2 = scanner.next();
						if (resp2.equalsIgnoreCase("si") || resp2.equalsIgnoreCase("s")) {
							acumulador += sueldobase * 0.03;
						} else {
							acumulador += sueldobase * 0.02;
						}
						System.out.println("¿El jugador anotó otra canasta? (Si/No)");
						resp3 = scanner.next();
					} while (!(resp3.equalsIgnoreCase("no") || resp3.equalsIgnoreCase("n")));
					System.out.println("Su sueldo base es de: $" + sueldobase);
					System.out.println("Usted anotó: " + contador + " canastas");
					System.out.println("Sus primas por canastas anotadas son de: $" + acumulador);
					System.out.println("Su sueldo total es de: $" + (sueldobase + acumulador));
				    } 

                    else {
					System.out.println("Su sueldo es de: $" + sueldobase);
				    }

				break;
			default:
				System.out.println("Opcion Invalida");
            }
            
            scanner.close();
        }
    }