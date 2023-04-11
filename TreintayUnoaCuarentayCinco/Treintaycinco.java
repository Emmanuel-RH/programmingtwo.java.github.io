package TreintayUnoaCuarentayCinco;

/** Programa 35
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: programa en Java que determine el pago de los jugadores de un equipo de basquetbol profesional quienes ganan de acuerdo a lo siguiente:
 * Tiene un sueldo base Si es defensa, tiene una prima de un 1% de su sueldo base por cada bloqueo que realice, si el bloqueo fue en playoff 
 * la prima es de 2%. Si es ofensivo, tiene una prima de 2% por canasta, si la canasta fue en playoff la prima es de 3%.
 * Date: 29/Marzo/2023
*/  

import java.io.*;

public class Treintaycinco {
	public static void main(String args[]) throws IOException {
        
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double acumulador;
		int contador = 0;
		int i = 0;
		String resp;
		String resp1;
		String resp2;
		String resp3;
		int rol;
		double sueldobase;

		do {
			i = i+1;
			System.out.println("Porfavor da el sueldo de base del jugador "+i);
			sueldobase = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Seleccione el rol del jugador");
			System.out.println("1. Defensivo ");
			System.out.println("2. Ofensivo ");
			rol = Integer.parseInt(bufEntrada.readLine());
			acumulador = 0;
			switch (rol) {
			case 1:
				System.out.println("El defensa realizo bloqueos?(Si/No)");
				resp1 = bufEntrada.readLine();
				if (resp1.equals("si") || resp1.equals("Si") || resp1.equals("SI") || resp1.equals("S") || resp1.equals("s")) {
					do {
						contador = contador+1;
						System.out.println("El bloqueo fue en playoff?(Si/No)");
						resp2 = bufEntrada.readLine();
						if (resp2.equals("si") || resp2.equals("Si") || resp2.equals("SI") || resp2.equals("S") || resp2.equals("s")) {
							acumulador = (acumulador+sueldobase*0.02);
						} else {
							acumulador = (acumulador+sueldobase*0.01);
						}
						System.out.println("El defensa realizo otro bloqueo?(Si/No)");
						resp3 = bufEntrada.readLine();
					} while (!(resp3.equals("No") || resp3.equals("N") || resp3.equals("no") || resp3.equals("NO") || resp3.equals("n")));
					System.out.println("Su sueldo base es de: $"+sueldobase);
					System.out.println("Usted tuvo "+contador+" bloqueos");
					System.out.println("Sus primas por bloqueos son de: $"+acumulador);
					System.out.println("Su sueldo total es de: $"+(sueldobase+acumulador));
				} else {
					System.out.println("Su sueldo es: "+sueldobase);
				}
				break;
			case 2:
				System.out.println("El jugador anoto canastas?(Si/No)");
				resp1 = bufEntrada.readLine();
				if (resp1.equals("si") || resp1.equals("Si") || resp1.equals("SI") || resp1.equals("S") || resp1.equals("s")) {
					do {
						contador = contador+1;
						System.out.println("La canasta fue en playoff?(Si/No)");
						resp2 = bufEntrada.readLine();
						if (resp2.equals("si") || resp2.equals("Si") || resp2.equals("SI") || resp2.equals("S") || resp2.equals("s")) {
							acumulador = (acumulador+sueldobase)*0.03;
						} else {
							acumulador = (acumulador+sueldobase)*0.02;
						}
						System.out.println("El jugador anoto otra canasta?(Si/No)");
						resp3 = bufEntrada.readLine();
					} while (!(resp3.equals("No") || resp3.equals("N") || resp3.equals("no") || resp3.equals("NO") || resp3.equals("n")));
					System.out.println("Su sueldo base es de: $"+sueldobase);
					System.out.println("Usted anoto "+contador+" canastas");
					System.out.println("Sus primas por canastas anotadas son de: $"+acumulador);
					System.out.println("Su sueldo total es de: $"+(sueldobase+acumulador));
				} else {
					System.out.println("Su sueldo es: "+sueldobase);
				}
				break;
			default:
				System.out.println("Opcion Invalida");
			}
			System.out.println("Hay otro jugador? (Si/No)");
			resp = bufEntrada.readLine();
		} while (!(resp.equals("No") || resp.equals("no") || resp.equals("NO") || resp.equals("N") || resp.equals("n")));
	}
}