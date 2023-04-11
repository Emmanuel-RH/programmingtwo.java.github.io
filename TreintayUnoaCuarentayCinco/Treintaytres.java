package TreintayUnoaCuarentayCinco;

/** Programa 33
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Una empresa americana tiene trabajadores con diversos estados migratorios en Estados Unidos y de acuerdo a su 
 * estado es el pago por hora. El Americano gana el 100% del precio de hora normal, el Residente gana el 80% del precio por hora y el 
 * ilegal gana solo el 60% del precio normal. Calcular el sueldo final de la semana de N trabajadores de esta empresa.
 * Date: 29/Marzo/2023
*/  

import java.util.Scanner; //Importar libreria para leer datos ingresados por el usuario.

public class Treintaytres {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int estadomigratorio;
		double horastrabajadas;
		int i = 0;
		double preciohora;
		String resp;
		double sueldosemanal = 0;
		
		do {
			i = i+1;
			System.out.println("Trabajador "+i);

			System.out.println("Introduce el precio por hora: ");
			preciohora = sc.nextDouble();

			System.out.println("Introduce las horas trabajadas: ");
			horastrabajadas = sc.nextDouble();
			System.out.println("Introduce el estado migratorio:");
			System.out.println("1 - Americano");
			System.out.println("2 - Residente");

			System.out.println("3 - Ilegal");
			estadomigratorio = sc.nextInt();

			switch (estadomigratorio) {
			case 1:
				sueldosemanal = preciohora*horastrabajadas;
				break;
			case 2:
				sueldosemanal = preciohora*horastrabajadas*0.8;
				break;
			case 3:
				sueldosemanal = preciohora*horastrabajadas*0.6;
				break;
			default:
				System.out.println("Estado migratorio invalido");
			}
			System.out.println("El sueldo semanal es: "+sueldosemanal);
            
			System.out.println("Hay otro trabajador? (Si/No)");
			resp = sc.next();
		} while (!(resp.equals("No") || resp.equals("no") || resp.equals("NO") || resp.equals("N") || resp.equals("n")));
		sc.close();
	}
}